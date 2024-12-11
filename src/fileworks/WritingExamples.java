package fileworks;

import fileworks.DataExport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingExamples {
    public static void main(String[] args) throws IOException {
        DataExport de = new DataExport("output.txt");
        for (int i = 0; i < 1000; i++) {
            de.writeLine(String.valueOf((int)(Math.random()*4001)));
        }
        de.finishExport();

        //Scanner - nemá write variantu

        //FileReader/Writer (znaky a byty)
        FileWriter fw = new FileWriter("output2.txt");
        for (int i = 0; i < 1000; i++) {
            fw.write(String.valueOf((int)(Math.random()*4001)));    //bez String.valueOf bude ten int interpretovat jako char, vypíše to utf-16 znaky
            fw.write("\n"); //jiank vše napíše do jednoho řádku
        }
        fw.close();

        //BufferedReader/Writer - po řádcích
        BufferedWriter bw = new BufferedWriter(new FileWriter("output3.txt"), 4096);    //size (SZ) = velikost bufferu
        for (int i = 0; i < 1000; i++) {
            bw.write(String.valueOf((int)(Math.random()*4001)));
            bw.newLine();
        }
        bw.flush(); //alternativa pro close pokud buffer ještě budu potřebovat, vlastně ten buffer jeom vyprázdnim ale nezavřu
        bw.close();
    }
}
