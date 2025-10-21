import tkinter as tk
from tkinter import ttk
from datetime import datetime
import pytz
import threading

# Lista de zonas horarias populares por país
COUNTRY_TIMEZONES = {
    "España": ["Europe/Madrid", "Atlantic/Canary"],
    "México": ["America/Mexico_City", "America/Cancun"],
    "Estados Unidos": ["America/New_York", "America/Chicago", "America/Los_Angeles"],
    "Japón": ["Asia/Tokyo"],
    "India": ["Asia/Kolkata"],
    "Australia": ["Australia/Sydney", "Australia/Perth"],
    "Brasil": ["America/Sao_Paulo"],
    "Argentina": ["America/Argentina/Buenos_Aires"]
}

class TimeApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Relojes Mundiales")
        self.root.attributes('-topmost', True)
        self.root.geometry("+10+10")  # Esquina superior izquierda
        self.root.overrideredirect(True)  # Sin bordes

        self.selected_country = tk.StringVar()
        self.selected_timezones = []

        self.create_widgets()
        self.update_times()

    def create_widgets(self):
        ttk.Label(self.root, text="Selecciona país:").pack()
        country_menu = ttk.Combobox(self.root, textvariable=self.selected_country, values=list(COUNTRY_TIMEZONES.keys()))
        country_menu.pack()
        country_menu.bind("<<ComboboxSelected>", self.load_timezones)

        self.timezone_vars = []
        self.time_labels = []

        for i in range(3):
            tz_var = tk.StringVar()
            self.timezone_vars.append(tz_var)
            tz_menu = ttk.Combobox(self.root, textvariable=tz_var)
            tz_menu.pack()
            tz_menu.bind("<<ComboboxSelected>>", self.update_selected_timezones)

            lbl = ttk.Label(self.root, text="", font=("Arial", 12))
            lbl.pack()
            self.time_labels.append(lbl)

    def load_timezones(self, event):
        country = self.selected_country.get()
        zones = COUNTRY_TIMEZONES.get(country, [])
        for i in range(3):
            self.timezone_vars[i].set("")
            menu = self.root.winfo_children()[2 + i * 2]
            menu['values'] = zones

    def update_selected_timezones(self, event):
        self.selected_timezones = [var.get() for var in self.timezone_vars if var.get()]

    def update_times(self):
        for i, tz_name in enumerate(self.selected_timezones):
            tz = pytz.timezone(tz_name)
            now = datetime.now(tz).strftime('%H:%M:%S')
            self.time_labels[i].config(text=f"{tz_name}: {now}")
        self.root.after(1000, self.update_times)

def run_app():
    root = tk.Tk()
    app = TimeApp(root)
    root.mainloop()

# Ejecutar en hilo para que se mantenga en segundo plano
threading.Thread(target=run_app, daemon=True).start()
