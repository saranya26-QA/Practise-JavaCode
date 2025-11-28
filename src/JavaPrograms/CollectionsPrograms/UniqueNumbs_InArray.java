package JavaPrograms.CollectionsPrograms;

import java.util.HashSet;

public class UniqueNumbs_InArray {
    public static void main(String[] args) {
        int[] arr= {2,3,4,1,4,5,6,7,6,8,7,9,0};
        HashSet<Integer> newarr = new HashSet<>();
        for(int i: arr)
        {    
            newarr.add(i);
        }
        System.out.println("Hash :"+newarr);
        }
    }
