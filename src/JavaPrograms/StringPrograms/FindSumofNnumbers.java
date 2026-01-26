package JavaPrograms.StringPrograms;

public class FindSumofNnumbers {
    public static void main(String[] args) {
        int n = 5;
        //output 1+2+3+4+5
        int result =0;
        for(int i=0;i<=n;i++)
        {
            result = result+i;
        }
        System.out.println(result);
    }
}
