package transport;
import javax.swing.*;
import java.awt.*;
public class MainApp {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private String selectedType;
    public MainApp() {
        frame = new JFrame("Transport App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        mainPanel.add(startPanel(), "start");
        mainPanel.add(selectPanel(), "select");
        mainPanel.add(inputPanel(), "input");
        frame.add(mainPanel);
        frame.setVisible(true);
    }
    // หน้าเริ่มต้น
    private JPanel startPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel("Transport Calculator", SwingConstants.CENTER);
        JButton startButton = new JButton("Start");
        startButton.addActionListener(e ->
                cardLayout.show(mainPanel, "select")
        );
        panel.add(label, BorderLayout.CENTER);
        panel.add(startButton, BorderLayout.SOUTH);
        return panel;
    }
    // หน้าเลือกการเดินทาง
    private JPanel selectPanel() {
        JPanel panel = new JPanel(new GridLayout(6,1));
        JButton walkBtn = new JButton("Walk");
        JButton motoBtn = new JButton("MotorcycleTaxi");
        JButton taxiBtn = new JButton("Taxi");
        JButton busBtn = new JButton("Bus");
        JButton btsBtn = new JButton("BTS");
        JButton backBtn = new JButton("Back");
        walkBtn.addActionListener(e -> selectTransport("Walk"));
        motoBtn.addActionListener(e -> selectTransport("MotorcycleTaxi"));
        taxiBtn.addActionListener(e -> selectTransport("Taxi"));
        busBtn.addActionListener(e -> selectTransport("Bus"));
        btsBtn.addActionListener(e -> selectTransport("BTS"));
        backBtn.addActionListener(e ->
                cardLayout.show(mainPanel, "start")
        );
        panel.add(walkBtn);
        panel.add(motoBtn);
        panel.add(taxiBtn);
        panel.add(busBtn);
        panel.add(btsBtn);
        panel.add(backBtn);
        return panel;
    }
    private void selectTransport(String type) {
        selectedType = type;
        cardLayout.show(mainPanel, "input");
    }
    // หน้าใส่ระยะทาง
    private JPanel inputPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        JLabel label = new JLabel("Enter Distance (km):");
        JTextField distanceField = new JTextField();
        JButton calculateBtn = new JButton("Calculate");
        JButton backBtn = new JButton("Back");
        calculateBtn.addActionListener(e -> {
            try {
                double distance = Double.parseDouble(distanceField.getText());
                Transport transport = createTransport(distance);
                double time = transport.calculateTimeMinutes();
                double fare = transport.calculateFare();
                JOptionPane.showMessageDialog(frame,
                        "Time: " + String.format("%.2f", time) + " minutes\n" +
                                "Fare: " + String.format("%.2f", fare) + " Baht");
                distanceField.setText("");
                cardLayout.show(mainPanel, "select");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid number");
            }
        });
        backBtn.addActionListener(e ->
                cardLayout.show(mainPanel, "select")
        );
        panel.add(label);
        panel.add(distanceField);
        panel.add(calculateBtn);
        panel.add(backBtn);
        return panel;
    }
    private Transport createTransport(double distance) {
        switch (selectedType) {
            case "Walk": return new Walk(distance);
            case "MotorcycleTaxi": return new MotorcycleTaxi(distance);
            case "Taxi": return new Taxi(distance);
            case "Bus": return new Bus(distance);
            default: return new BTS(distance);
        }
    }
    public static void main(String[] args) {
        new MainApp();
    }
}