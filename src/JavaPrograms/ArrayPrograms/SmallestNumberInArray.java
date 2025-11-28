package JavaPrograms.ArrayPrograms;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] arr ={87,10,25,76,4,100};
        int smallest = arr[0];

        for(int i=1; i< arr.length;i++)
        {
            if(arr[i]< smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println("smallest:" + smallest);
    }
}
