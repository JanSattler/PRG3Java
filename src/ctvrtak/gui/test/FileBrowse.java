package ctvrtak.gui.test;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Arrays;

public class FileBrowse {
    public static void main(String[] args) {
        new InputWindow().setVisible(true);
    }
}

class InputWindow extends JFrame {

    JTextField input;
    public InputWindow() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        input = new JTextField("Zadejte cestu k souboru");
        input.setPreferredSize(new Dimension(500, 100));
        input.setFont(new Font("Consolas", Font.BOLD, 24));
        input.setHorizontalAlignment(SwingConstants.CENTER);

        JButton goButton = new JButton("Go");

        goButton.addActionListener( e -> {
            File folder = new File(input.getText());
            if (folder.isDirectory()) {
                ResultWindow.printFiles(folder);
                new ResultWindow(folder).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Zadejte správnou cestu");
            }
        });

        goButton.setPreferredSize(new Dimension(100, 100));
        goButton.setFont(new Font("Consolas", Font.BOLD, 32));

        this.add(input);
        this.add(goButton);

        this.pack();
    }
}

class ResultWindow extends JFrame {

    public static void printFiles(File folder) {
        System.out.println(Arrays.toString(folder.listFiles()));
        System.out.println(folder.listFiles().length);
    }

    public static int getAmountOfFiles (File folder) {
        int amount = 0;
        for (File file : folder.listFiles()) {
            if (file.isFile()) {
                amount++;
            }
        }
        return amount;
    }

    public static int getAmountOfDirs (File folder) {
        int amount = 0;
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                amount++;
            }
        }
        return amount;
    }

    public ResultWindow(File folder) {
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel dirStats = new JPanel();
        dirStats.setPreferredSize(new Dimension(200, 400));
        dirStats.setLayout(new GridLayout(2, 1));

        JLabel numberOfDirs = new JLabel("Složek: " + getAmountOfDirs(folder));
        numberOfDirs.setOpaque(true);

        JLabel numberOfFiles = new JLabel("Souborů: " + getAmountOfFiles(folder));
        numberOfDirs.setOpaque(true);

        dirStats.add(numberOfDirs);
        dirStats.add(numberOfFiles);


        JPanel files = new JPanel();

        files.setPreferredSize(new Dimension(400, 300));
        files.setLayout(new GridLayout(folder.listFiles().length, 3));

        for (File file : folder.listFiles()) {

        }

        this.add(dirStats, BorderLayout.WEST);
        this.add(files, BorderLayout.CENTER);


        this.pack();
    }

}
