package Day5.Collections;

import java.sql.SQLOutput;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Deeksha");
        names.add("Kamal");
        names.add("Sachin");
        names.add("Kamal");
        names.add("Pallavi");
        names.add("Ravi");
        names.add("Darshny");
        names.add("Pallavi");
        names.add("Jaina");
        names.add("Deeksha");

        HashSet<Integer>  numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);

        System.out.println(names);
        System.out.println(numbers);
        System.out.println(names.contains("Kamal"));
        System.out.println(names.contains("Rahul"));
        names.clear();
        System.out.println(names.isEmpty());

    }
}
