package session3;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {


     //sets do not guarantee insertion order
        //sets do not allow duplicate values
        Set<String> names = new HashSet<>();
        names.add("Mike");
        names.add("Lincoln");
        names.add("Morris");
        names.add("Bryan");


//        Iterator<String> iterator = names.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println( iterator.next() );
//        }


        //Insertion order is maintained by LinkedHashSet, while it is not with HashSet
        Set<String> students  = new LinkedHashSet<>();
        students.add("Omer");
        students.add("Sulamita");
        students.add("Denise");
        students.add("Omer");
        students.add("Tatiana");
        students.add("Mike");
        students.add("Sulamita");
        students.add("Bryan");
        students.add("Omer");
        students.add("Tom");

 //       System.out.println(students);


        Iterator<String> iterator = students.iterator();

//        while (iterator.hasNext()){
//            String name = iterator.next();
//            if (name.equalsIgnoreCase("Mike")){
//                System.out.println(name);
//            }
//        }


        //TreeSet maintains natural ordering of elements
        //TreeSet maintains only unique values
        Set<String> books = new TreeSet<>();

        books.add("Harry Potter");
        books.add("Beaty and Beast");
        books.add("Snow");
        books.add("Ironman");
        books.add("Spiderman");
        books.add("Java for Beginners");


        System.out.println(books);


        Set<Integer> ages = new TreeSet<>();
        ages.add(40);
        ages.add(12);
        ages.add(100);
        ages.add(2);
        System.out.println(ages);



    }
}
