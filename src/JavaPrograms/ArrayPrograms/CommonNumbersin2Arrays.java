package JavaPrograms.ArrayPrograms;

public class CommonNumbersin2Arrays {
    
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,1,5,1};
        int[] arr2 ={8,2,4,5,1,2,1};
  
        for(int i=0;i< (arr1.length); i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
            if(arr1[i] == arr2[j])
               {
               System.out.println("its common: " + arr1[i]);
                break;
               }
              
              
            }

        }



    }


}
