import java.awt.*;
import javax.swing.*;

public class First extends JFrame {
    JTextField t;
    JButton b;

    public First() {
        setTitle("My First Java Gui");
        setSize(400, 500);
        t = new JTextField();
        t.setColumns(10);
        // t.getToolTipText("Enter Something here");
        b = new JButton("Click Me");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(t);
        add(b);
        setVisible(true);
    }

    public static void main(String[] args) {
        new First();
    }
}
