package JavaPrograms.ArrayPrograms;

public class PrimeNumbers {
    public static void main(String[] args) {

        for(int i=3; i<10; i++){
            if(i%2 ==0){
                System.out.println(i +" not prime");
            }
            else{
                System.out.println(i +" is prime");

            }
        }
    }
}
