package session1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperations {
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
        //size of a set is always the number of unique elements
        System.out.println(names);

        names.remove("Mary");

        System.out.println(names);

        System.out.println(  names );


        names.contains("George");
        boolean containsTwoNames = names.containsAll( Set.of("George","Lee","abc") ); //returns true if names contains George AND Lee
        boolean containsThreeNames = names.containsAll(List.of("Peter","Lee","Oliver"));

        System.out.println(containsTwoNames);
        System.out.println(containsThreeNames);


        names.add("Walter");

        names.addAll( List.of("Robert","Quincy","Mike") );

        System.out.println(names);



    }
}
