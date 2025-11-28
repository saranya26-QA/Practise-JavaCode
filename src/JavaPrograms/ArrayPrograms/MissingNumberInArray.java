package JavaPrograms.ArrayPrograms;

public class MissingNumberInArray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,7,9};

        for(int i=1; i<=9; i++)
        {
            boolean found= false;
            for( int j: arr)
            {
                if(i==j)
                {
                    found = true;
                    break;
                }
            }
            if(found == false)
            System.out.println("Missing Num :" +i);
         

        }
    }
}
