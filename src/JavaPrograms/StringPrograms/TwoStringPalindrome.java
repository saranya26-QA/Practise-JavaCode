package JavaPrograms.StringPrograms;

public class TwoStringPalindrome {

    public static void main(String[] args) {

        String a = "sara";
        String b = "saras";

        String c = "";
        String d = "";

        for (int i = a.length() - 1; i >= 0; i--)
        {
            c = c + a.charAt(i);

        }
        System.out.println("Reverse of a is: " +c);

        for (int i = b.length() - 1; i >= 0; i--)
        {
            d = d + b.charAt(i);

        }
        System.out.println("Reverse of b is: " +d);

        if (c.equals(a))
        {
                    System.out.println("Palindrome is:" + a);
        }else if (d.equals(b))
        {
            System.out.println("Palindrome is:" + b);
        }else{
            System.out.println("No Palindrome");
        }
        }

    }

