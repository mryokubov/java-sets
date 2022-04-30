package session2;

import java.util.*;


public class CollectionsJava {
    public static void main(String[] args) {



        //primitive arrays:
        int[] nums = new int[5]; //this array has the size of 7, and it is fixed


        //ArrayList
        List<Integer> digits = new LinkedList<>(); //creates a primitive array with capacity of [0,0,0,0,0,0,0,0,0,0]

        digits.add(45); //head
        digits.add(67); //node1
        digits.add(45); //node2
        digits.add(67);
        digits.add(45);
        digits.add(67);
        digits.add(45);
        digits.add(67);
        digits.add(45);
        digits.add(67); //node10
        digits.add(45); //tail


        System.out.println(digits.get(5));







    }
}
