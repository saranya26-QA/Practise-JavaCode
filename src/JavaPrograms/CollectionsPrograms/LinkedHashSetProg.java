package JavaPrograms.CollectionsPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProg {
    public static void main(String[] args) {
        
        Set<Object> myset = new LinkedHashSet<>();

        myset.add("Sasa");
        myset.add(1);
        myset.add(true);
        myset.add(1.5);
        //maintains insertion order
        System.out.println(myset);
        
    }
}
