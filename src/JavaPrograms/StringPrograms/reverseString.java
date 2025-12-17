package JavaPrograms.StringPrograms;

public class reverseString {

    public static void main(String[] args) {

        String name = "Saranya";
        String reverse ="";
        for(int i=name.length()-1;i>=0; i--)
        {
            reverse = reverse+ name.charAt(i);
        }
        System.out.println(reverse);
        // 2nd way - String Buffer
        String name1 = "Siddhu";
        String reverse1 ="";
        StringBuffer newobj = new StringBuffer(name1);
        System.out.println(newobj.reverse());

    }

}
