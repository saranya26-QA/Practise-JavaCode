package JavaPrograms.CollectionsPrograms;

import java.util.HashMap;

public class DuplicateNum_Occurance {
    public static void main(String[] args) {
        int[] arr= {1,3,2,5,4,3,6,3,7,8,2,4,6,4,2,9};
        HashMap<Integer, Integer> Duplicates = new HashMap<>();
            for(Integer i : arr)
            {
                Duplicates.put(i, Duplicates.getOrDefault(i,0)+1);
            }
            System.out.println(Duplicates);
    }
}
