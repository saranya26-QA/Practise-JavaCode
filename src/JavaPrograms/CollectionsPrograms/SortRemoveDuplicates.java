package JavaPrograms.CollectionsPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortRemoveDuplicates {
    public static void main(String[] args) {
        
        int[] randomarray = {1,50,3,0,-10,100,23,1,50,3};
        System.out.println("Original Array :"+ Arrays.toString(randomarray));

        Set<Integer> sortedarray = new TreeSet<>();
        for(int i: randomarray){
            sortedarray.add(i);
        }
        System.out.println("Sorted Array: "+sortedarray);
        Iterator itrs = sortedarray.iterator();
        while(itrs.hasNext()){
            System.out.println(itrs.next());
        }
    }
}
