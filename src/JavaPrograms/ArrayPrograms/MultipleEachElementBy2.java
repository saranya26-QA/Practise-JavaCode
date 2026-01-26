package JavaPrograms.ArrayPrograms;

import java.util.Arrays;

public class MultipleEachElementBy2 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            result[i]=arr[i]*2;
        }
        System.out.println(Arrays.toString(result));
    }
}
