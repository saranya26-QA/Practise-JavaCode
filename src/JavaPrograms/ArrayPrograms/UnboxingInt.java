package JavaPrograms.ArrayPrograms;

public class UnboxingInt {
    public static void main(String[] args) {
        
        int a = 10;
        Integer b = a; // autoboxing convert primitive to wrapper

        //Integer a = new Integer(4);
        int x = b; // unboxing convert wrapper to primitive

        System.out.println(x);

    }
}
