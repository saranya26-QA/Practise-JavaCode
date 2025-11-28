package JavaPrograms.ArrayPrograms;

public class SumExceptOneNumber {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int sum =0;

        for(int num: arr)
        {
            if(num!=40)
             sum = sum+num;  
        }
        System.out.println("Sum :"+ sum);
    }
}
