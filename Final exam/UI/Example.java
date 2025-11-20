import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example implements ActionListener {
    JFrame f;
    JTextField txt;
    JButton btn;

    public Example() {
        f = new JFrame("Example");
        f.setSize(500, 750);
        txt = new JTextField("field");
        txt.setColumns(10);
        btn = new JButton("Click");
        f.add(txt);
        f.add(btn);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // 1st Task
        txt.setBackground(Color.BLACK);
        // 2nd Task
        Font fnt = new Font("Arial", Font.BOLD, 20);
        txt.setFont(fnt);
        // 3rd Task
        txt.setForeground(Color.RED);
    }

    public static void main(String[] args) {
        new Example();
    }
}