package oopCollectingg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setting {  //nějaká množina tam je jednou nebo vůbec
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*121);
        }
        System.out.println(Arrays.toString(array));
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(5);
        uniqueNumbers.add(5);
        uniqueNumbers.add(5);
        uniqueNumbers.add(5);
        System.out.println(uniqueNumbers);

        //vygeneruj 100 random unikatnich cisel
        while (uniqueNumbers.size() < 100){
            uniqueNumbers.add((int)(Math.random()*121));
        }
        System.out.println(uniqueNumbers);

        //je neco v mnozine (setu)? a)
        System.out.println(uniqueNumbers.contains(6));
        //zkus pridat, nevyjde=už to tam je
        System.out.println(uniqueNumbers.add(6));

        ArrayList<Integer> trulyUniqueNumbers = new ArrayList<>();

    }
}
