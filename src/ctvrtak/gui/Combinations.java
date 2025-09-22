package ctvrtak.gui;

import javax.swing.*;
import java.awt.*;

public class Combinations extends JFrame {
    Combinations () {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        String[] choices = {"Borders", "Grids", "Flows"};

        JComboBox<String> comboBox = new JComboBox<>(choices);

        JButton windowButton = new JButton("kokot");

        this.add(comboBox);
        this.add(windowButton);
    }

    public static void main(String[] args) {
        new Combinations().setVisible(true);
    }
}
