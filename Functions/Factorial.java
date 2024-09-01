// Methods are called by the objects of class
// Functions are called directly


// Find the factorial of a number
import java.util.Scanner;

public class Factorial {
    
    public static void calculateFactorial(int n){

        if(n < 1){
            System.out.println("Invalid number");
            return;
        }

        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        calculateFactorial(n);
    }
}
