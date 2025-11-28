package JavaPrograms.CollectionsPrograms;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {
    
    public static void main(String[] args) {
        //direct
        HashSet<Object> objset = new HashSet<>();
        //upcasting
        Set<Integer> num = new HashSet<>();
        
        objset.add("Sasa");
        objset.add(35);
        objset.add(true);
        objset.add(35);
        //does not maintain insertion order
        System.out.println(objset);

        boolean numis = objset.contains(35);
        System.out.println(numis);

       System.out.println(objset.isEmpty());

       Object[] objarr = objset.toArray();
       System.out.println(objarr);
    
       Integer[] arr1 ={1,2,2,3,3,4,4,5,5,6};
       HashSet<Integer> arr2 = new HashSet<>();

       for(Integer i :arr1){
        arr2.add(i);
    
       }
       System.out.println("HashSET :" + arr2);

}



}


