package JavaPrograms.StringPrograms;

public class SkipFewWordsInSentence {
    public static void main(String[] args) {


        String a =" This mad is mad a mad sentence";
        //program to remove mad from sentence

        String[] b = a.split(" ");
        String rev = "";

        for(String x:b)
        {
            if(!x.equals("mad")){

                rev = rev+x;
            }
                rev = rev+" ";

        }
        System.out.println(rev);


    }
}
