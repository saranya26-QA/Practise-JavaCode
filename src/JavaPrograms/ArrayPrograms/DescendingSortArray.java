package JavaPrograms.ArrayPrograms;

import java.util.Arrays;

public class DescendingSortArray {

    public static void main(String[] args) {
        
        int[] arr={2,6,10,5,3,8,1,7,4,9};


    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=0; j<arr.length-1; j++)
        {
            if(arr[j]<arr[j+1])
            {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

    System.out.println(Arrays.toString(arr));
    }
    
}
