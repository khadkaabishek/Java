import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Square extends JFrame implements ActionListener {

    JPanel panel;
    JButton red, blue;

    public Square() {
        setSize(500, 500);
        panel = new JPanel();
        setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.GREEN);
        add(panel, BorderLayout.CENTER);
        red = new JButton("Red");
        blue = new JButton("Blue");
        panel.add(red);
        panel.add(blue);
        panel.setLayout(new FlowLayout());
        red.addActionListener(this);
        blue.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) {
            panel.setBackground(Color.red);
        } else {
            panel.setBackground(Color.BLUE);

        }
    }

    public static void main(String[] args) {
        new Square();
    }
}
