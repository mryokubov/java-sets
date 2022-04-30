package session2;

import java.util.*;

public class ListTypes {

    public static void main(String[] args) {


        //List is an interface which is implmented by classes: ArrayList, LinkedList, Vector, Stack
        //List preserves insertion order
        //List allows duplicate elements


        //LinkedList is a Node-Based data structure where a node represents each element
        //first node is known as head
        //last node is know as tail
        //each node references its next element and its previous element
        List<Integer> list = new LinkedList<>();

        list.add(90);
        list.add(100);
        list.add(120);
        list.add(140);
        list.add(140);

        System.out.println(list.get(3));

        //Vectos is available since JDK 1.0
        //Vector is a thread-safe collection, whereas ArrayList is not
        List<Integer> vec = new Vector<>();

        vec.add(1);
        vec.add(2);
        vec.add(1);
        vec.add(2);
        vec.add(1);
        vec.add(2);
        vec.add(1);
        vec.add(2);
        vec.add(1);
        vec.add(2);
        vec.add(3); //11th



        //LIFO - Last In First Out
        Stack<String> books = new Stack<>();

        books.push("Harry Potter");
        books.push("Snow");
        books.push("Beaty and Beast");
        books.push("Spiderman");
        books.push("ironman");

        //  peek method returns the top element, but does not delete it
        String topElement = books.peek();

        // pop() method will remove the top element from the stack
        books.pop();


        System.out.println(books.size());






    }
}
