package app;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Fishing Utility");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);

            JTabbedPane tabs = new JTabbedPane();
            tabs.addTab("Dashboard", panelLabel("Current weather, tides (coming soon)"));
            tabs.addTab("Log Catch", panelLabel("Form to save catches (coming soon)"));
            tabs.addTab("Spots", panelLabel("Manage fishing spots with GPS (coming soon)"));
            tabs.addTab("Settings", panelLabel("API keys, units, defaults (coming soon)"));

            frame.setContentPane(tabs);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static JPanel panelLabel(String text) {
        JPanel p = new JPanel(new GridBagLayout());
        JLabel lbl = new JLabel(text);
        lbl.setFont(lbl.getFont().deriveFont(Font.PLAIN, 16f));
        p.add(lbl);
        return p;
    }
}
