// Create a Swing application with 1 text field and 1 label , text field should
// show where is the cursor located either in or out , label should show exact
// cords of cursor

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example2 extends JFrame implements MouseListener, MouseMotionListener {
    JTextField text;
    JLabel label;

    public Example2() {
        text = new JTextField("");
        text.setColumns(5);
        label = new JLabel("");
        setSize(500, 800);
        text.setEditable(false);
        add(text);
        add(label);
        setLayout(new FlowLayout());
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        text.setText("IN");
    }

    public void mouseExited(MouseEvent e) {
        text.setText("OUT");
    }

    public void mouseMoved(MouseEvent e) {
        String value = "X : " + e.getX() + " Y : " + e.getY();
        label.setText(value);
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public static void main(String[] args) {
        new Example2();
    }

}