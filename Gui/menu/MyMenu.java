import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyMenu extends JFrame implements ActionListener {
    JMenu menu;
    JMenuBar mb;
    JMenuItem select, c, v, x, close;
    JTextArea t;

    public MyMenu() {
        setSize(400, 500);
        mb = new JMenuBar();
        setJMenuBar(mb);
        menu = new JMenu("Menu");
        mb.add(menu);
        select = new JMenuItem("Select All");
        c = new JMenuItem("Copy");
        v = new JMenuItem("Paste");
        x = new JMenuItem("Cut");
        close = new JMenuItem("Close");
        t = new JTextArea();
        t.setToolTipText("Type Something here");
        add(t);
        menu.add(select);
        menu.add(c);
        menu.add(v);
        menu.add(x);
        menu.addSeparator();
        menu.add(close);

        setVisible(true);
        setLayout(new FlowLayout());

        select.addActionListener(this);
        c.addActionListener(this);
        v.addActionListener(this);
        x.addActionListener(this);
        close.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String txt = e.getActionCommand();
        switch (txt) {
            case "Select All":
                t.selectAll();
                break;
            case "Copy":
                t.copy();
                break;
            case "Paste":
                t.paste();
                break;
            case "Cut":
                t.cut();
                break;
            case "Close":
                System.exit(0);

        }

    }

    public static void main(String[] args) {
        new MyMenu();
    }
}
