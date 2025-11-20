import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("BoxLayout Demo - Y_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        // Create panel with BoxLayout Y_AXIS
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // padding

        // Add 4 fields vertically
        panel.add(createField("Name:"));
        panel.add(Box.createVerticalStrut(10)); // spacing
        panel.add(createField("Email:"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(createField("Phone:"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(createField("City:"));

        // Add panel to frame
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    // Helper method to create a field (label + textfield)
    private static JPanel createField(String labelText) {
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new BorderLayout(5, 5));
        JLabel label = new JLabel(labelText);
        JTextField textField = new JTextField(15);
        fieldPanel.add(label, BorderLayout.NORTH);
        fieldPanel.add(textField, BorderLayout.CENTER);
        return fieldPanel;
    }
}
