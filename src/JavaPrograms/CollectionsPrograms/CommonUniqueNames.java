package JavaPrograms.CollectionsPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class CommonUniqueNames {
    

    public static void main(String[] args) {
        

        String[] arr1 ={"Sasa", "Siddhu", "Pawan", "Aria"};
        String[] arr2 ={"Dharma", "Siddhu", "Diya", "Aria"};

        HashSet<String> list1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<String> list2 = new HashSet<>(Arrays.asList(arr2));

        list1.retainAll(list2);

        System.out.println("Common Unique Names: " + list1);
    }
}
