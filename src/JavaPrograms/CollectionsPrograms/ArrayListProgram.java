package JavaPrograms.CollectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListProgram {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrlist1 = new ArrayList<>();
        arrlist1.add(10);
        //System.out.println(arrlist1);
        arrlist1.add(20);
        arrlist1.add(40);
        //System.out.println(arrlist1);
        arrlist1.add(2,30);
         System.out.println(arrlist1);
        // arrlist1.get(2)
         //System.out.println(arrlist1.get(2));
         arrlist1.set(3,35);
         System.out.println(arrlist1);
         arrlist1.remove(2);
          System.out.println(arrlist1);
          System.out.println("number of elements present in list:" + arrlist1.size());
          System.out.println("does it contain 20: "  + arrlist1.contains(20));
        for(Integer num:arrlist1){
            System.out.println("For Each loop :" + num);
        }
       Iterator<Integer> its = arrlist1.iterator();
       while(its.hasNext())
       {
        System.out.println("iterator:" + its.next());
       }

        ListIterator<Integer> litr = arrlist1.listIterator();
        while(litr.hasNext()){
           System.out.println("ListIterator Forward:" + litr.next());
        }

        
        while(litr.hasPrevious()){
           System.out.println("ListIterator Reverse:" + litr.previous());
        }

    }
        
    
}
