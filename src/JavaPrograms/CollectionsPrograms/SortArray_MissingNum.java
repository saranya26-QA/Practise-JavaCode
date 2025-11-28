package JavaPrograms.CollectionsPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortArray_MissingNum {
    public static void main(String[] args) {
        int[] arr={1,3,10,5,6,2,8};
        int highest = 10;
        //Sorting the array - using TreeSet
        Set<Integer> numset = new TreeSet<>();
            for(int i: arr)
            {
                numset.add(i);
            }
            System.out.println("Sorted :"+ numset);
    
            //Find missing number
            for(int j= 1; j<=highest; j++)
            {
                if(!(numset.contains(j)))
                {
                    System.out.println("Missing : "+j);
                }
            }
    
        }
}
