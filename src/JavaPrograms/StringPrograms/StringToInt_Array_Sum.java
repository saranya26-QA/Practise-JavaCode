package JavaPrograms.StringPrograms;

public class StringToInt_Array_Sum {
    

    public static void main(String[] args) {
        String[] arr={"1", "2", "3"};
        int result = 0;

        for(String s:arr)
        {
            result = result+ Integer.parseInt(s);
        }

        System.out.println(result);
    }
}
