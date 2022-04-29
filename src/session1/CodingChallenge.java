package session1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CodingChallenge {
    public static void main(String[] args) {

        int[] nums = {1,2,1,3,1,2,3,4,1,2,3,1,2,2,1,6,9};

        System.out.println(Arrays.toString(nums));
         CodingChallenge challenge = new CodingChallenge();

        int[] n = challenge.uniqueValues(nums);

        System.out.println(Arrays.toString(n));

    }

    //given an argument nums, return a new array which contains ONLY unique elements
    public int[] uniqueValues(int[] nums){

        Set<Integer>  set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add( nums[i] ); //1,2
        }
        int[] result = new int[ set.size() ];
        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()){
            result[i] = iterator.next();
            i++;
        }
        return result;
    }

    public int[] uniqueValues2(int[] nums){
        return Arrays.stream(nums).distinct().toArray();
    }


}
