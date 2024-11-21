package oopCollectingg;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //LinkedList<Integer> alsoNumbers = new LinkedList<>();

        numbers.add(5);
        System.out.println(numbers);

        ArrayList<Integer> stillNumbers = new ArrayList<>();
        stillNumbers.add(5);
        stillNumbers.add(2);
        stillNumbers.add(8);
        stillNumbers.add(3);
        numbers.addAll(stillNumbers);
        System.out.println(numbers);

        //problematické s Integerem
        numbers.remove(5);  //odeberu int pouze pomocí indexu, ne podle hodnoty

        //řešení
        ArrayList<Integer> yetStillNumbers = new ArrayList<>();
        yetStillNumbers.add(10);
        numbers.remove(yetStillNumbers);

    }
}
