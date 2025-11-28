package JavaPrograms.CollectionsPrograms;

import java.util.LinkedList;

public class LinkedListProgram {

    public static void main(String[] args) {
        
        LinkedList<Integer> linkedlistobj = new LinkedList<>();
            linkedlistobj.add(20);
            linkedlistobj.add(30);
            linkedlistobj.addFirst(10);
            System.err.println(linkedlistobj);
            linkedlistobj.addLast(40);
            System.err.println(linkedlistobj);
            linkedlistobj.add(4,50);
            System.err.println(linkedlistobj);
// access elements
            System.out.println("get 3rd index Element :" + linkedlistobj.get(3));


    }
    
}
