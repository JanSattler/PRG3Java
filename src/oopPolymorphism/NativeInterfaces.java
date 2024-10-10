package oopPolymorphism;

import java.util.ArrayList;
import java.util.Collections;

public class NativeInterfaces {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Carl", 25, 44.3));
        persons.add(new Person("Old Carl", 99, 39.6));
        persons.add(new Person("Jarmil", 19, 40.3));
        persons.add(new Person("Radim", 33, 50.3));
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println("Sort by shoe size: ");

        System.out.println(persons);






    }
}

class Person implements Comparable<Person>{
    String name;
    int age;
    double shoeSize;

    public Person(String name, int age, double shoeSize) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "\n"+name+", "+age+", "+shoeSize;
    }

    @Override
    public int compareTo(Person o) {
        return (int)(this.shoeSize - o.shoeSize);
    }
}
