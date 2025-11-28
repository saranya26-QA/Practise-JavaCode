package JavaPrograms.ArrayPrograms;

public class ReverseOrderArray {
    
    public static void main(String[] args) {
        int[] arr={30,78,96,23,55};

        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.println("Reverse Order: "+ arr[i]);

        }
    }
}
