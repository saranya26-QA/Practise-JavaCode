package JavaPrograms.StringPrograms;

public class CheckIfStringIsNonAlphabetic {
    public static void main(String[] args) {

        String s = "B1aBy";
        char[] a = s.toCharArray();
        Boolean flag = true;

        for (char c : a) {

            if (!Character.isAlphabetic(c)) {

                flag = false;
                break;
            }
        }

            if (flag) {
                System.out.println("Is  alphabetic");
            } else {
                System.out.println("Is non alphabetic");
            }
        }
    }


