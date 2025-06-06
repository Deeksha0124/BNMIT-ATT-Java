package Day5.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] duplicates = {"Java", "Python", "SQL", "C", "C", "Java", "C++", "Kotlin","Python"};
        Set<String> uniqueData = new LinkedHashSet<>();
        for(String str : duplicates) {
            uniqueData.add(str);
        }

        //Normal way
        //System.out.println("After removing duplicates:"  + uniqueData);

        //Lambda expression
        uniqueData.forEach(x -> System.out.println(x));
    }
}
