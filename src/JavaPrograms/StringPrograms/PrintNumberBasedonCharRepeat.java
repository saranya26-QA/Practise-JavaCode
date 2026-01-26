package JavaPrograms.StringPrograms;

public class PrintNumberBasedonCharRepeat {
    //Transform an input “kkkiiaaaak” to print “3k2i4a1k”

    public static void main(String[] args) {

        System.out.println("Try programiz.pro");
        String x = "kkkiiaaaak"; //a3b2c1
        int count =1;
        String result="";
        for(int i=1;i<x.length();i++)
        {
            if((x.charAt(i)) == (x.charAt(i-1)))
            {
                count++;
            }
            else
            {
                result = result + count + x.charAt(i-1);
                count = 1;
            }
        }
        result = result + count+ x.charAt(x.length() - 1);
        System.out.println(result);
    }
}
