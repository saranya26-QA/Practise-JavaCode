package JavaPrograms.StringPrograms;

public class DuplicateCharinString {

    public static void main(String[] args) {


        String name = "Rudhr";

        char a[] = name.toCharArray();

        char duplicate = ' ';

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    duplicate = a[i];
                }
            }
        }

        System.out.println(duplicate);

    }
}
