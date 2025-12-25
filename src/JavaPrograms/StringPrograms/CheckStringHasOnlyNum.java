package JavaPrograms.StringPrograms;

public class CheckStringHasOnlyNum {
    public static void main(String[] args) {

        String s="198";
        char[] r  = s.toCharArray();

        boolean check = true;

        for(char c:r)
        {
            if(!Character.isDigit(c))
            {
                check = false;
                break;
            }
        }
        if(check)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
