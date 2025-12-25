package JavaPrograms.StringPrograms;

public class PrintStringMirror {
    public static void main(String[] args) {

        String str ="I am happy";

        //output is Welcome world world Welcome
        // str + world Welcome

        String[] arr = str.split(" ");

        String rev ="";
        for(int i=arr.length-1;i>=0;i--){
            rev=rev+arr[i];
            rev =rev+"  ";
        }

        System.out.println(rev);
        System.out.println(str+" "+rev);
    }
}
