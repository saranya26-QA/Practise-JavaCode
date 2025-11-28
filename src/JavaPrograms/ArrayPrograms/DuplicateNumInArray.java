package JavaPrograms.ArrayPrograms;

public class DuplicateNumInArray {
//     public static void main(String[] args) {
//         int[] arr={2,4,6,8,77,33,2,1,4,5,8};

//         for(int i=0; i<arr.length;i++)
//         {
//             for(int j=i+1; j<arr.length;j++)
//             {
//                 if(arr[i] == arr[j])
//                 {
//                     System.out.println("Duplicate :"+arr[i]);
//                 }
//             }
//         }
//     }
// }

public static void main(String[] args) {
    int[] arr={1,4,5,7,4,8,9,7,7,7,20,1};

    for(int i=0; i<=arr.length-1; i++)
{
    for( int j =i+1; j<=arr.length-1; j++)
    {
        if(arr[i] == arr[j])
        {
            System.out.println("Duplicate Num :" +arr[j]);
        }
    }
}



}

}