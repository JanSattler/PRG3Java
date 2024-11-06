package oopGenerics;

import java.util.ArrayList;

public class Basics {

    static <E> void printArray(E[] array){    //to E je že bere cokoliv za datovej typ
        System.out.println();
        for (E type : array){
            System.out.print(type + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //built-in
        //generický prg se zaměřuje na to mezi <>
        //dávam tam objekty
        //ArrayList<String> strings;
        //ArrayList<Integer> numbers;

        Integer[] numbers = {15, 27, 64, 42, 5, 8};
        String[] words = {"delta", "aplha", "beta", "gamma"};
        Double[] realNumbers = {Math.PI, -Math.sqrt(17),.5, 4.0};

        printArray(numbers);
        printArray(words);
        printArray(realNumbers);
    }
}
