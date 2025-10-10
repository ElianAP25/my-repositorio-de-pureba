import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class MenuConsolas {
    private ArrayList<Process> consolas = new ArrayList<>();
    private String title = "Menú de Consolas";

    public void setTitle(String t) {
        this.title = t;
    }

    public void showMenu() {
        System.out.println("\n" + title);
        System.out.println("1. Abrir consola CMD");
        System.out.println("2. Abrir consola PowerShell");
        System.out.println("3. Cerrar todas las consolas");
        System.out.println("4. Salir");
    }

    public int readOption() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elige una opción: ");
        return sc.nextInt();
    }

    public void abrirConsola(String comando) {
        try {
            Process p = new ProcessBuilder(comando).start();
            consolas.add(p);
            System.out.println("Consola abierta.");
        } catch (IOException e) {
            System.out.println("Error al abrir la consola.");
        }
    }

    public void cerrarConsolas() {
        for (Process p : consolas) {
            p.destroy();
        }
        consolas.clear();
        System.out.println("Consolas cerradas.");
    }

    public static void main(String[] args) {
        MenuConsolas menu = new MenuConsolas();
        menu.setTitle("Menú Ejecutable de Consolas");
        int opcion;
        do {
            menu.showMenu();
            opcion = menu.readOption();
            switch (opcion) {
                case 1:
                    menu.abrirConsola("cmd.exe");
                    break;
                case 2:
                    menu.abrirConsola("powershell.exe");
                    break;
                case 3:
                    menu.cerrarConsolas();
                    break;
                case 4:
                    menu.cerrarConsolas();
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}