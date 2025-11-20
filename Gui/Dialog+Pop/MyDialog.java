import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class MyDialog extends WindowAdapter implements ActionListener, MouseListener {
    JFrame f;
    JPopupMenu menu;
    JMenuItem item1, item2;
    JLabel label;

    public MyDialog() {

        f = new JFrame("Hey");
        f.setSize(400, 500);
        label = new JLabel("Nothing selected rn ");
        f.add(label);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        menu = new JPopupMenu("Menu");
        item1 = new JMenuItem("Item1");
        item2 = new JMenuItem("Item2");
        menu.add(item1);
        menu.add(item2);
        item1.addActionListener(this);
        item2.addActionListener(this);
        f.addWindowListener(this);
        f.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item1) {

            label.setText("Item1 Selected");
            JOptionPane.showMessageDialog(f, "!st Button Clicked 😆");
        } else {
            label.setText("Item2 Selected");
            JOptionPane.showMessageDialog(f, "2nd Button Clicked 😆");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        menu.show(f, e.getX(), e.getY());
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(f, "Do u wanna close?");
        if (choice == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
        }
    }

    public static void main(String[] args) {
        new MyDialog();
    }
}