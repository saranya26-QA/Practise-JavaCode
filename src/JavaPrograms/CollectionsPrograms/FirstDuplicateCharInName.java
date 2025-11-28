package JavaPrograms.CollectionsPrograms;

import java.util.HashMap;

public class FirstDuplicateCharInName {
    public static void main(String[] args) {
        HashMap<Character,Integer> firsts = new HashMap<>();

        String name = "sarraa";

        for(Character chars:name.toCharArray())
        {
            if(firsts.containsKey(chars))
            {
                System.out.println(chars);
                break;
            }
            else{
                firsts.put(chars, firsts.get(chars));
            }
        }
    }
}
