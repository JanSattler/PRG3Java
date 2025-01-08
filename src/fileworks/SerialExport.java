package fileworks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialExport {
    public static void main(String[] args) throws IOException {
        Coordinates coords = new Coordinates(5, 6, 20);
        System.out.println("Exportuju: "+coords);


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single coord.ser"));
        oos.writeObject(coords);
        oos.close();
    }
}
