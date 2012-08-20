package zetcode;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FirstStep extends JFrame {
    public FirstStep() {
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FirstStep ex = new FirstStep();
                ex.setVisible(true);
            }
        });
    }
}
