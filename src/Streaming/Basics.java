package Streaming;

import java.util.ArrayList;

public class Basics {   //vezmeš data z kolecke (nebo jiná struktura bruh) a pak je to zpracuje
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println(numbers);

        System.out.println("Size: "+numbers.size());
    }
}
