package JavaPrograms.CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapProg {
    public static void main(String[] args) {
        
        HashMap<String,Integer> fruitsMap = new HashMap<>();

        fruitsMap.put("Apple",10);
        fruitsMap.put("Mango", 20);
        fruitsMap.put("Grapes", 30);
        int quantity = fruitsMap.get("Grapes");
        System.out.println("Grapes :"+quantity);
        Set<String> fruitKeySet= fruitsMap.keySet();
        System.out.println(fruitKeySet);
        
        for(Map.Entry<String,Integer> fruitentry : fruitsMap.entrySet())
        {
            System.out.println(fruitentry.getKey()+ " : "+ fruitentry.getValue());

        }
    }
}
