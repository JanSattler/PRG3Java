package fileworks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ciphering {
    public static void main(String[] args) throws IOException {
        Caesar cipher = new Caesar(3, "Caesar cipher");
        List<String> lines = Files.readAllLines(Paths.get("inputs\\cipherText.txt"));
        //pro ucely debugu, ulozit cely souboe do variable
        ArrayList<String> encryptedLines = new ArrayList<>();
        for (String line : lines){
            encryptedLines.add(cipher.encrypt(line));
        }
    }
}

abstract class Cipher{  //abstract - vylepšený rozhraní
    int key;
    String name;

    public Cipher(int key, String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cipher: " + name + " secret: " + key;
    }

    abstract String encrypt(String input);
    abstract String decrpyt(String encryptedInput);
}

class Caesar extends Cipher{
    public Caesar(int key, String name) {
        super(key, name);
    }

    @Override
    String encrypt(String input) {
        return null;
    }

    @Override
    String decrpyt(String encryptedInput) {
        return null;
    }
}
