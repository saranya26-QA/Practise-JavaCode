package JavaPrograms.CollectionsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberInSequence {
    

    public static void main(String[] args) {
       Integer[] arr1 ={0,1,2,3,4,5,6,8,10};
        //int n = arr1[arr1.length-1];

        List<Integer> seq= new ArrayList<>(Arrays.asList(arr1));


        for(int i=0;i<=10;i++){
            if(!seq.contains(i))
            {
                System.out.println("Missing number is: " +i);
            }
        }
        


    }
}
