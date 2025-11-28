package JavaPrograms.CollectionsPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonUniqueNums {

    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,1,2,1};
        int[] arr2 ={8,2,4,5,1,2,1};

        HashSet<Integer> common = new HashSet<>();

        for(int i : arr1){
            for(int j:arr2){
                if(i == j){
                    common.add(i);
                    
                }
            }
        }
                System.out.println("Unique & common: " + common);

       

        // for(int i=0; i<arr1.length;i++)
        // {
        //     for(int j=0;j<arr2.length;j++)
        //     {
        //         if(arr1[i]==arr2[j])
        //         {
        //             common.add(arr1[i]);
        //             break;
        
        //         }

        //     }
        // }

        //list1.retainAll(list2);

  
    }
    
}
