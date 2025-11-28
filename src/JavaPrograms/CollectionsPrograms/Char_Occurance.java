package JavaPrograms.CollectionsPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Char_Occurance {
    public static void main(String[] args) {
        String name = "saaraannyyaaa";

        HashMap<Character,Integer> charoccurance = new LinkedHashMap<>();
        System.out.println("Count each occurance of each character from name ");
        for(Character charKey:name.toCharArray())
        {
            if(charoccurance.containsKey(charKey))
            {
             charoccurance.put(charKey, charoccurance.get(charKey)+1);

            }
            else
            charoccurance.put(charKey,1);

        }
        System.out.println(charoccurance);

        System.out.println("Print unique chars");

        for(Character char1: charoccurance.keySet())
        {
            if(charoccurance.get(char1)== 1)
            {
                System.out.println(char1 +":" + charoccurance.get(char1));
            }
        }

    }
}
