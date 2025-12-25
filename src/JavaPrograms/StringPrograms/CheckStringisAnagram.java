package JavaPrograms.StringPrograms;

import java.util.Arrays;
import java.util.Locale;
public class CheckStringisAnagram {

    public static void main(String[] args)

    {

        String s1 = "TeA";
        String s2 ="EaT";
       // String word1 = s1.toLowerCase();
        //String word2= s2.toLowerCase();

        System.out.println(s1);
        System.out.println(s2);
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not Anagram");
            }

    }


}
