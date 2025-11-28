package JavaPrograms.ArrayPrograms;

import java.util.HashSet;

public class UniqueNumsinArray {
    public static void main(String[] args) {
        int[] arr= {2,3,4,1,4};
        
        for(int i=0; i<arr.length;i++)
        {
            Boolean unique = true;
            for(int j=0;j<arr.length;j++)
            {
                if (i!=j && arr[i] == arr[j])
                {
                    unique=false;
                    break; 
                }             
            }
            if(unique)
            {
                 System.out.println(arr[i]);
            }
           
        }
        
        }
    }

