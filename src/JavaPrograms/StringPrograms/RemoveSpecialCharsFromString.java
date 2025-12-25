package JavaPrograms.StringPrograms;

public class RemoveSpecialCharsFromString {
    public static void main(String[] args) {

        String s ="B@aby1!#hearts&love";
        //output Baby1
        char[] a = s.toCharArray();

        String name ="";

        for(char c:a)
        {
            if(Character.isAlphabetic(c) || Character.isDigit(c))
            {
                name = name+c;

            }

        }
        System.out.println(name);
    }
}
