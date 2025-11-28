package JavaPrograms.ArrayPrograms;

public class SumofNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int addition=0;

        for(int i=0; i<arr.length;i++)
        {  
            addition = addition + arr[i];
        
        }
      System.out.println("Sum :"+addition);

    }
}
