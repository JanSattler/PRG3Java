package fileworks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CollectionSerialize {
    public static void main(String[] args) throws IOException {
        ArrayList<Coordinates> coordinates = new ArrayList<>();
        coordinates.add(new Coordinates(15,16,19));
        coordinates.add(new Coordinates(50,122,18));
        coordinates.add(new Coordinates(1,18,22));

        System.out.println(coordinates);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coordiatesArrayList.ser"));
        oos.writeObject(coordinates);
        oos.close();
    }
}
