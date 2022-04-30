package session2;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class TestingSpeed {

    public static void main(String[] args) {


        long startTime =  System.nanoTime();
        List<Integer> arrList = new Stack<>();
        for (int i = 0; i < 10000000; i++) {
            arrList.add(i);
            //System.out.println(arrList);

        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.

        System.out.println("------");
        System.out.println(duration/1000000);
        System.out.println("------");

    }
}
