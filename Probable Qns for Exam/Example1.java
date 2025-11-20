
// Create a Swing application , clicking a button should find the square of a number
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Example1 extends JFrame implements ActionListener {
    JTextField text;
    JLabel disp;
    JButton btn;

    Example1() {
        setSize(500, 600);
        text = new JTextField("Enter a number here");
        disp = new JLabel();
        btn = new JButton("Click");
        add(text);
        add(disp);
        add(btn);
        setLayout(new FlowLayout());
        setVisible(true);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource() == "btn");
        int num = Integer.parseInt(text.getText());
        disp.setText("Square : " + num * num);
    }

    public static void main(String[] args) {
        new Example1();
    }
}