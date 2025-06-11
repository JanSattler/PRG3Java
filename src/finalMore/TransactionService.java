package finalMore;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {

    public static List<Transaction> transactions = new ArrayList<>();
    public static List<PersonalAccount> accounts = new ArrayList<>();


    public static void loadAccounts(String filePath) {
        try {
            accounts = Files.lines(Paths.get(filePath))
                    .map(line -> line.split(";"))
                    .map(params -> new PersonalAccount(
                            Integer.parseInt(params[0]),
                            params[1],
                            Double.parseDouble(params[2])
                    ))
                    .toList();
        } catch (IOException e) {
            System.out.println("Soubor nenalezen");
        }

    }
    public static void loadTransactions(String filePath){
        try {
            transactions = Files.lines(Paths.get(filePath))
                    .map(line -> line.split(";"))
                    .map(params -> new Transaction(
                            params[0],
                            Integer.parseInt(params[1]),
                            Integer.parseInt(params[1]),
                            Double.parseDouble(params[3])
                    ))
                    .toList();
        } catch (IOException e) {
            System.out.println("Soubor nenalezen");
        }
    }

    public static void transfer(Account from, Account to){}
    public static void processTransactions(){}
    public static void printReport(){}

}
