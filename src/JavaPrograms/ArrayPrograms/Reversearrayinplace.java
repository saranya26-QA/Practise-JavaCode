package JavaPrograms.ArrayPrograms;

import java.util.Arrays;

public class Reversearrayinplace {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        for(int i=0; i<arr.length-1; i++)
        {
            int temp = arr[arr.length-1];
            arr[arr.length-1] = arr[i];
            arr[i]= temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
