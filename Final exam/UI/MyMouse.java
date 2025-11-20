import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMouse extends MouseAdapter {
    JLabel yn, position;
    JFrame f;

    public MyMouse() {
        yn = new JLabel("Initializating ...");
        position = new JLabel("X : , Y : ");
        f = new JFrame();
        f.setSize(400, 500);
        f.add(yn);
        f.add(position);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
    }

    public void mouseEntered(MouseEvent m) {
        yn.setText("IN");
    }

    public void mouseExited(MouseEvent m) {
        yn.setText("OUT");
    }

    public void mouseMoved(MouseEvent m) {
        String msg = "X : " + m.getX() + " Y : " + m.getY();
        position.setText(msg);
    }

    public static void main(String[] args) {
        new MyMouse();
    }
}