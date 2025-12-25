package JavaPrograms.StringPrograms;

public class CheckIfStringHasSpecialChars {

    public static void main(String[] args) {

        //String str = "a@b#c$d&e";
        String str = "@#$&%";

        char[] arr=str.toCharArray();
        boolean check =true;

        for(char c:arr) {
            if (Character.isAlphabetic(c) || Character.isDigit(c))
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
