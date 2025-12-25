package JavaPrograms.StringPrograms;

public class RemoveDuplicatesfromString {
    public static void main(String[] args) {
        String a = "abcab";

        String result = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(result.indexOf(ch)==-1)
                result = result +ch;

        }
        System.out.println(result);
        }
    }