import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class MenuConsolas extends JFrame {
    private ArrayList<Process> consolas = new ArrayList<>();

    public MenuConsolas() {
        setTitle("Menú de Consolas");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnCmd = new JButton("Abrir consola CMD");
        JButton btnPowerShell = new JButton("Abrir consola PowerShell");
        JButton btnCerrar = new JButton("Cerrar todas las consolas");
        JButton btnSalir = new JButton("Salir");

        btnCmd.addActionListener(e -> abrirConsola("cmd.exe"));
        btnPowerShell.addActionListener(e -> abrirConsola("powershell.exe"));
        btnCerrar.addActionListener(e -> cerrarConsolas());
        btnSalir.addActionListener(e -> {
            cerrarConsolas();
            System.exit(0);
        });

        add(btnCmd);
        add(btnPowerShell);
        add(btnCerrar);
        add(btnSalir);
    }

    private void abrirConsola(String comando) {
        try {
            Process p = new ProcessBuilder(comando).start();
            consolas.add(p);
            JOptionPane.showMessageDialog(this, "Consola abierta.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al abrir la consola.");
        }
    }

    private void cerrarConsolas() {
        for (Process p : consolas) {
            p.destroy();
        }
        consolas.clear();
        JOptionPane.showMessageDialog(this, "Consolas cerradas.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuConsolas().setVisible(true);
        });
    }
}