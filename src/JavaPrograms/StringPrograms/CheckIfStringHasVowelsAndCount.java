package JavaPrograms.StringPrograms;

public class CheckIfStringHasVowelsAndCount {
    public static void main(String[] args) {
        String s = "icecreams for you";
        String word = "";
        //run a for loop for , if condition to not consider spaces

        for(int i =0;i<s.length(); i++){
            if(s.charAt(i)!=' ')
            {
                word = word+s.charAt(i);
            }
    }
        System.out.println(word);
        int count =0;
        for(int i =0;i<word.length(); i++){
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                System.out.println(word.charAt(i));
                count++;
            }
        }
        System.out.println(count);

    }
}
