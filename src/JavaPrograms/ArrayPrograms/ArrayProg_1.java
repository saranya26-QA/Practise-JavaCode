package JavaPrograms.ArrayPrograms;

public class ArrayProg_1 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,5,6,7};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        for(int num: arr)
        {
            System.out.println("Integer :"+num);
        }

        for(int num: arr)
        {
            if(num>3)
            {
                System.out.println("Greater than 3 :"+num);
            }
        }
        
        
    }
}
