import javax.swing.*;
import java.awt.*;

public class Shape1 extends JFrame {
    JButton btn1, btn2, btn3, long_btn, short_btn;

    public Shape1() {
        // setSize(400, 500);
        btn1 = new JButton("Btn1 ");
        btn2 = new JButton("Btn2 ");
        btn3 = new JButton("Btn3 ");
        long_btn = new JButton("Long Normal Button 4 ");
        short_btn = new JButton("5");
        add(btn1);
        add(btn2);
        add(btn3);
        add(long_btn);
        add(short_btn);
        btn1.setAlignmentX(CENTER_ALIGNMENT);
        btn2.setAlignmentX(CENTER_ALIGNMENT);
        btn3.setAlignmentX(CENTER_ALIGNMENT);
        long_btn.setAlignmentX(CENTER_ALIGNMENT);
        short_btn.setAlignmentX(CENTER_ALIGNMENT);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Shape1();
    }
}
