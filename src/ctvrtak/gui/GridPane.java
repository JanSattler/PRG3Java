package ctvrtak.gui;

import javax.swing.*;
import java.awt.*;

public class GridPane extends JFrame {

 public GridPane(int dim) throws HeadlessException {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(dim, dim));
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
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
        new GridPane(10).setVisible(true);
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
