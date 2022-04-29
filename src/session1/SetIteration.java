package session1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteration {
    public static void main(String[] args) {


        Set<String> names = new HashSet<>();
        names.add("Mary");
        names.add("Kevin");
        names.add("Peter");
        names.add("Oliver");
        names.add("Peter");
        names.add("Mary");
        names.add("George");
        names.add("Lee");

        System.out.println(names.size());

        //WE use the iterator method to loop sets

        Iterator<String> iterator =  names.iterator();

        //as long has iterator has next element
        while (  iterator.hasNext()  ){
            String each = iterator.next();
            System.out.println(each);
        }


        Set<Integer> nums = new HashSet<>();
        nums.add(19);
        nums.add(34);
        nums.add(55);
        nums.add(99);
        nums.add(16);
        nums.addAll(Set.of(6,23,98));

        //given a set of integers, print the odd elements

        Iterator<Integer> allNumbers = nums.iterator();

        while (allNumbers.hasNext()){

            int n = allNumbers.next();
            if (n % 2 != 0){
                System.out.println(n);
            }
        }

    }
}
