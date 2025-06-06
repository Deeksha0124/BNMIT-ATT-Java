package Day5.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveItemsUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(1);
        numbers.add(20);
        numbers.add(3);
        numbers.add(7);
        numbers.add(15);
        numbers.add(78);
//        Iterator<Integer> it = numbers.iterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            if(i > 10){
//                it.remove();
//            }
//        }

        numbers.removeIf(i -> i > 10); //here LHS part "i" is called as "Predicate" and the RHS part "i > 10" is called as "Condition"
        System.out.println("List after removal of numbers > 10: " + numbers);

    }
}
