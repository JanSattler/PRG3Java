package final2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PharmacyPractice {

    static List<Medication> medications = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();


    static boolean loadMedications(String filePath){
        try {
            medications  = Files.lines(Paths.get(filePath))
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(params -> new Medication(
                            params[0],
                            params[1],
                            Double.parseDouble(params[2])
                    ))
                    .toList();
            return true;
        } catch (IOException e) {
            System.out.println("soubor nenalezen");
            return false;
        }
    }

    static void loadAndProcessOrders(String filePath){
        try {
            orders  = Files.lines(Paths.get(filePath))
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(params -> new Order(
                            params[0],
                            params[1],
                            Integer.parseInt(params[2])
                    ))
                    .toList();
        } catch (IOException e) {
            System.out.println("soubor nenalezen");
        }
    }

    static void printInventory(){

    }


    public static void main(String[] args) {
        loadMedications("inputs\\final2\\medications.csv");
        loadAndProcessOrders("inputs\\final2\\orders.csv");

        HashMap<String, Integer> stockMedications = new HashMap<>();

        for (Order order : orders) {
            if (!stockMedications.containsKey(order.getMedicationName())) {
                ArrayList<Order> newMed = new ArrayList<>();
                newMed.add(order);
                stockMedications.put(order.getMedicationName(), order.getPieces());
            } else {
                stockMedications.en
            }
        }

    }

} class Medication{
    String name, type;
    double pricePerPiece;

    public Medication(String name, String type, double pricePerPiece) {
        this.name = name;
        this.type = type;
        this.pricePerPiece = pricePerPiece;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }
}

class Order {
    String action, medicationName;
    int pieces;

    public Order(String action, String medicationName, int pieces) {
        this.action = action;
        this.medicationName = medicationName;
        this.pieces = pieces;
    }

    public String getAction() {
        return action;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public int getPieces() {
        return pieces;
    }
}
