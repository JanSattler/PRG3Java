package ctvrtak.gui;

import javax.swing.*;
import java.awt.*;

public class TestGUIOnly extends JFrame {

    public TestGUIOnly() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(1000, 600);

        this.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.red);
        northPanel.setPreferredSize(new Dimension(1000, 50));

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.blue);
        southPanel.setPreferredSize(new Dimension(1000, 50));

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.yellow);
        westPanel.setPreferredSize(new Dimension(200, 500));

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.green);
        centerPanel.setLayout(new GridLayout(10, 11));

        for (int i = 1; i < 111; i++) {
            centerPanel.add(new JButton(String.valueOf(i)));
        }

        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(westPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new TestGUIOnly().setVisible(true);
    }
}
