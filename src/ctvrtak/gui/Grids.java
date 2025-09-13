package ctvrtak.gui;

import javax.swing.*;
import java.awt.*;

public class Grids extends JFrame {

    public Grids() {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new GridLayout(5, 2, 10, 5));    //udělá mřížku s danym počtem rows a columns, ale neni uplně vymakanej, když to nevyjde tak se ten poslední ennačte nebo se udělá necelá row

        for (int i = 0; i < 11; i++) {
            this.add(new JButton(String.valueOf(i+1)));
        }
    }

    public static void main(String[] args) {
        new Grids().setVisible(true);
    }
}
