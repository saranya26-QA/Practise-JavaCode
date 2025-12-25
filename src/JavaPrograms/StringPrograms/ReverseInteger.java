package JavaPrograms.StringPrograms;

public class ReverseInteger {
    public static void main(String[] args) {

        int a=123; //output should be 321
        int rev=0;

        while(a!=0)
        {
            rev = rev*10+a%10;
            a=a/10;

        }

        System.out.println(rev);

        if(a==rev)
        {
            System.out.println("Yes it is Palindrome");
        }
        else
        {
            System.out.println("No it is Not Palindrome");
        }
    }
}
