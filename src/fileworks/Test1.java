package fileworks;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Test1 {
    final static Comparator<File> BY_SIZE = new Comparator<File>() {
        @Override
        public int compare(File o1, File o2) {
            return Long.compare(o1.length(), o2.length());
        }
    };
    public static void main(String[] args) throws IOException {
        File directory = new File("inputs\\testData");
        if (directory.isDirectory()){
            System.out.println("Is Directory");
            directory = new File("inputs\\testData");
            File[] files = directory.listFiles();
            ArrayList<File> txts = new ArrayList<>();
            for (File file : files){
                if (file.toString().endsWith(".txt")){
                    txts.add(file);
                }
            }
            txts.sort(BY_SIZE);
            StringBuilder name = new StringBuilder(" ");
            StringBuilder line = new StringBuilder(" ");
            for (File file : txts){
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                line.append(bufferedReader.readLine()+"\n");
                name.append(file.getName());
                name.append("-");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("outputs\\"+name+".txt"));
            bw.write(String.valueOf(line));
            bw.newLine();
            bw.close();

        }
        else {
            System.out.println("Is not directory");
        }
    }
}
