package self_study;

import java.util.Arrays;

public class CountingItemsInside {

    public static void main(String[] args) {

        //task i:
        int[]nums= {1,55,7,898,9,55};
        //print out thr array to see what's inside
      //find the count of numbers more than 100;
        System.out.println(Arrays.toString(nums));

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
         if(nums[i]>100)
            count++;

        }
        System.out.println(count);

    }
}
