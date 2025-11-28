package JavaPrograms.ArrayPrograms;

import java.util.Arrays;

public class SortTheArray_FindMissing {
    public static void main(String[] args) {
        int[] arr={2,5,3,9,7,1,10};

         Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //[1, 2, 3, 5, 7, 9, 10]

        for(int i=1; i<=10; i++)
        {
            boolean existingnum = false;
            for(int j:arr)
            {
                if(i==j)
                {
                    existingnum = true;
                    break;
                }
                
            }

            if(existingnum == false)
            System.out.println("Missing Number is :"+i);
        }

    }
}
