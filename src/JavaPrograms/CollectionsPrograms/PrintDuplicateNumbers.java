package JavaPrograms.CollectionsPrograms;

import java.util.HashSet;

public class PrintDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4,4,5,6,6,6,7};

        HashSet<Integer> Uniquenums = new HashSet<>();
        HashSet<Integer> Duplicates = new HashSet<>();

        for(int i:arr1)

        {
            if(!(Uniquenums.add(i))){
                Duplicates.add(i);
            }
            
        }

        System.out.println("Duplicates: "+Duplicates);
    }
}
