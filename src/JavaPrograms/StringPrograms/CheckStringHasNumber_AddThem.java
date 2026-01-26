package JavaPrograms.StringPrograms;

public class CheckStringHasNumber_AddThem {

    public static void main(String[] args) {

        String name ="sar3any7a";
        int output=0 ;

        char[] a= name.toCharArray();
        for(int i = 0; i < a.length-1; i++) {
            if(Character.isDigit(a[i])){
                int num = Character.getNumericValue(a[i]);
               output = output+num;

            }

        }
        System.out.println(output);
    }
}
