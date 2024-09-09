package test;

import fileworks.DataExport;
import fileworks.DataImport;

public class test {
    public static void main(String[] args) {
        DataImport di = new DataImport("inputs.txt");

        String line;
        String[] params;
        int a, b;
        while (di.hasNext()) {
            line = di.readLine();
            System.out.println(line);
            params = line.split(",");
            a = Integer.parseInt(params[0]);
            b = Integer.parseInt(params[1]);
            switch (params[2]) {
                case "A":
                    System.out.println(a+b); break;

                case "S":
                    System.out.println(a-b); break;

                case "M":
                    System.out.println(a*b); break;

                case "D":
                    System.out.println(a/b); break;
            }
        }
        //di.printFile();
        di.finishImport();
    }
}
