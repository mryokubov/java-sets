package session1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) throws InterruptedException {


        //Set is another data structure that works with unique values only
        //HashSet does guarantee insertion order, the first element inserted may end up in a different place
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(13);
        set.add(12);
        set.add(13);
        set.add(14);


        Set<String> names = new HashSet<>();
        names.add("Kevin");
        names.add("Peter");
        names.add("Oliver");
        names.add("Peter");
        names.add("Mary");
        names.add("George");
        names.add("Lee");

   //     boolean peterExists = names.contains("Harry");
//         System.out.println(peterExists);
        System.out.println(names);
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names);

        boolean empty = names.isEmpty();
        System.out.println(empty);

        names.remove("Lee");
        System.out.println(names);



    }
}
