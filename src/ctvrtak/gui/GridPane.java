package ctvrtak.gui;

import javax.swing.*;
import java.awt.*;

public class GridPane extends JFrame {

    final static int DIMENSIONS = 10;

    public GridPane() throws HeadlessException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(DIMENSIONS, DIMENSIONS));
        for (int i = 0; i < DIMENSIONS; i++) {
            for (int j = 0; j < DIMENSIONS; j++) {
                if ((i+j)%2 == 1) {
                    this.add(new Piece(Color.RED));
                } else {
                    this.add(new Piece(Color.blue));
                }
            }

        }
        this.setSize(450, 450);
        //this.pack();
    }

    public static void main(String[] args) {
        new GridPane().setVisible(true);
    }


}

class Piece extends JLabel {    //prostě na custom častý komponenty
    public Piece(Color color) {
        this.setText(" ");
        this.setFont(new Font("Consolas", Font.BOLD, 30));
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.setOpaque(true);
        this.setBackground(color);
    }
}
