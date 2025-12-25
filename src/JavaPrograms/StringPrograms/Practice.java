package JavaPrograms.StringPrograms;

public class Practice {

    public static void main(String[] args) {


        String name = "priyankaky";
        char a[] = name.toCharArray();
        char duplicate = ' ';
        String skip ="";
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicate =  a[i];
                    skip = skip+duplicate;
                }
            }
        }
        System.out.println(skip);
    }
}
