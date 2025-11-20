
//Create a application while closing that window ask whether quit or not like in real life application ,quit iff yes-option
import java.awt.event.*;
import javax.swing.*;

public class Example3 extends WindowAdapter {
    JFrame f;

    public Example3() {
        f = new JFrame("MyWindow");
        f.setSize(500, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(f, "DO YOU WANNA CLOSE");
        if (choice == JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        new Example3();
    }
}
