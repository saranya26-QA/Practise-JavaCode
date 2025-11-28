package JavaPrograms.ArrayPrograms;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr ={1,5,10,87,43,99};
        int largest = arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i] > largest)
            {
                largest =arr[i];
            }
            
        }
         System.out.println(largest);
    }
}
