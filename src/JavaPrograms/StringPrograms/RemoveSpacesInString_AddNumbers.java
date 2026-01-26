package JavaPrograms.StringPrograms;

public class RemoveSpacesInString_AddNumbers {

    public static void main(String[] args) {

        String a="12Sa 34ra 56n 7 89y 10a";
        String nospaces="";
        int sum = 0;
        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i)!= ' ')
            {
                nospaces= nospaces + a.charAt(i);

            }
        }
        System.out.println(nospaces);

        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                sum = sum+Character.getNumericValue(a.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
