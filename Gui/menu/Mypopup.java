import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Mypopup extends MouseAdapter implements ActionListener {
    JFrame f;
    JPopupMenu menu;
    JMenuItem item1, item2, item3;
    JLabel l;

    public Mypopup() {
        f = new JFrame();
        f.setSize(400, 500);

        menu = new JPopupMenu();
        f.add(menu);
        item1 = new JMenuItem("Item1");
        item2 = new JMenuItem("Item2");
        item3 = new JMenuItem("Item3");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        l = new JLabel("Noting Selected");
        f.add(l);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        f.addMouseListener(this);

    }

    public void mouseClicked(MouseEvent e) {
        menu.show(f, e.getX(), e.getY());
    }

    public void actionPerformed(ActionEvent e) {
        String txt = e.getActionCommand();
        if (txt != null) {
            l.setText(txt);
        }
    }

    public static void main(String[] args) {
        new Mypopup();
    }
}
