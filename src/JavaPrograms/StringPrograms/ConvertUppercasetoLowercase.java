package JavaPrograms.StringPrograms;

public class ConvertUppercasetoLowercase {
    public static void main(String[] args) {

        String a="ABCDEGF";
        String lower = a.toLowerCase();
        String lowC="";
        System.out.println(lower);

        //char[] arr = a.toCharArray();

        for(int i=0; i<a.length();i++){
            if(a.charAt(i)!=' ')
            {
                lowC = lowC+ Character.toLowerCase(a.charAt(i));

            }
        }
        System.out.println(lowC);

    }
}
