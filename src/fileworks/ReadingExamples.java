package fileworks;

import fileworks.DataImport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ReadingExamples {
    public static void main(String[] args) throws IOException, ArithmeticException {
        File file = new File("src\\countries.txt");
        if (file.exists() && file.isFile()){
            DataImport di = new DataImport(file.getPath());
            while (di.hasNext()){
                System.out.println(di.readLine());
            }
            di.finishImport();
            System.out.println();
        }

        //Scanner sc = new Scanner("pico,nevim,kurwa");
        //sc.useDelimiter(",");
        //while (sc.hasNext()){
        //    System.out.println(sc.next());
        //}
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",");
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();


        FileReader reader = new FileReader(file);
        int input;
        while ((input = reader.read()) != -1){
            System.out.println((char) input);
        }
        reader.close();
    }
}
