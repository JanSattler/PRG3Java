package ctvrtak.gui.booking;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setLocationRelativeTo(null);
        setTitle("Vacation manager");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 400);

        setLayout(new BorderLayout());

        JLabel headerLabel = new JLabel("Manage vacation applications");
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(headerLabel, BorderLayout.NORTH);

        String[] headers = {"Name", "Phone Number", "Destination", "Days", "Discount"};
        DefaultTableModel model = new DefaultTableModel(headers, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        model.addRow(new String[]{"Tester", "123123123", "Mountains", "31", "NO"});
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JButton inputButton = new JButton("new application");
        inputButton.addActionListener(e -> {
            new Booking().setVisible(true);
        });
        JButton saveButton = new JButton("save");
        buttonsPanel.add(inputButton);
        buttonsPanel.add(saveButton);
        add(buttonsPanel, BorderLayout.SOUTH);


    }

    public static void main(String[] args) {
        new MainMenu().setVisible(true);
    }
}
