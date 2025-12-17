package JavaPrograms.StringPrograms;

public class ReverseEachWordInString {
    public static void main(String[] args) {

        String s = "Siddhu is a good boy";
        String[] abc= s.split(" ");
        String rev ="";
        //String rees ="";
       for(String z: abc){

           for(int i = z.length()-1;i>=0;i--){

               rev=rev+z.charAt(i);
           }
           rev = rev+"  ";
       }
        System.out.println(rev);
    }
}
