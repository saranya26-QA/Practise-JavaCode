package JavaPrograms.ArrayPrograms;

import java.util.Arrays;

public class SecondLargestNumberinArray {
    public static void main(String[] args) {
        
        int[] arr={4,8,1,9,2,6,3,10,5,7};

        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0; j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            // if(i==0)
            // {
            //     int firsthighest=arr[arr.length-1];
            //     System.out.println("firsthighest: "+firsthighest);
            // }
        }
        System.out.println("Second Largest: "+arr[arr.length-2]);

    }
}
