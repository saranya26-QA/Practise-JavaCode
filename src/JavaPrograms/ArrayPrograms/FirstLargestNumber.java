package JavaPrograms.ArrayPrograms;

import java.util.Arrays;

public class FirstLargestNumber {
    public static void main(String[] args) {
        int[] arr={2,4,8,1,6,9,3,7,10,5};

        //Unsorted Array
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        //Sorted Array is 
        System.out.println(Arrays.toString(arr));
        int highest = arr[arr.length-1];
        System.out.println("First Largest :"+highest);
        System.out.println("Second Largest :"+arr[arr.length-2]);

        
        
    }
}
