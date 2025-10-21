import javax.swing.*;
import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;

public class WorldClockApp {
    private static final Map<String, List<String>> COUNTRY_TIMEZONES = Map.of(
        "España", List.of("Europe/Madrid", "Atlantic/Canary"),
        "México", List.of("America/Mexico_City", "America/Cancun"),
        "Estados Unidos", List.of("America/New_York", "America/Chicago", "America/Los_Angeles"),
        "Japón", List.of("Asia/Tokyo"),
        "India", List.of("Asia/Kolkata"),
        "Australia", List.of("Australia/Sydney", "Australia/Perth"),
        "Brasil", List.of("America/Sao_Paulo"),
        "Argentina", List.of("America/Argentina/Buenos_Aires")
    );

    private final JFrame frame;
    private final JComboBox<String> countryBox;
    private final List<JComboBox<String>> timezoneBoxes = new ArrayList<>();
    private final List<JLabel> timeLabels = new ArrayList<>();

    public WorldClockApp() {
        frame = new JFrame("Relojes Mundiales");
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width - 310, 10);

        countryBox = new JComboBox<>(COUNTRY_TIMEZONES.keySet().toArray(new String[0]));
        countryBox.addActionListener(e -> updateTimezones());
        frame.add(new JLabel("Selecciona país:"));
        frame.add(countryBox);

        for (int i = 0; i < 3; i++) {
            JComboBox<String> tzBox = new JComboBox<>();
            timezoneBoxes.add(tzBox);
            frame.add(tzBox);

            JLabel timeLabel = new JLabel("Hora: --:--:--");
            timeLabels.add(timeLabel);
            frame.add(timeLabel);
        }

        updateTimezones();
        startClock();
        frame.setVisible(true);
    }

    private void updateTimezones() {
        String country = (String) countryBox.getSelectedItem();
        List<String> zones = COUNTRY_TIMEZONES.getOrDefault(country, List.of());
        for (JComboBox<String> box : timezoneBoxes) {
            box.removeAllItems();
            for (String zone : zones) {
                box.addItem(zone);
            }
        }
    }

    private void startClock() {
        javax.swing.Timer timer = new javax.swing.Timer(1000, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            for (int i = 0; i < timezoneBoxes.size(); i++) {
                String zoneId = (String) timezoneBoxes.get(i).getSelectedItem();
                if (zoneId != null) {
                    ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zoneId));
                    timeLabels.get(i).setText(zoneId + ": " + now.format(formatter));
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WorldClockApp::new);
    }
}