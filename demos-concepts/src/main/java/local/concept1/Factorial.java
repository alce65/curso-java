package local.concept1;

public class Factorial {

    static long calculateFactorial(long number) {
        // if (number < 0) {
        //     number = number * -1;
        // }

        long result = 1;

        for (long i = number; i > 0; i--) {
            result = result * i;
            // result *= i;   
        }
        return result;
    } 

    public static void main(String[] args) {
        System.out.println(calculateFactorial(10));
        
    }
    
}
