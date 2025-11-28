package JavaPrograms.ArrayPrograms;

import java.util.Arrays;

public class AscendingSortArray {
    public static void main(String[] args) {
        int[] arr={5,2,4,1,3,6,9,8,10,7};

    for(int i=0; i< arr.length-1;i++)
    {
       for(int j=0; j<arr.length-1; j++)
       {
        if(arr[j]>arr[j+1])
        {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
       }
    }

    System.out.println(Arrays.toString(arr));
    }
}
