import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        // Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
        //     1 : + (Addition) a + b
        //     2 : - (Subtraction) a - b
        //     3 : * (Multiplication) a * b
        //     4 : / (Division) a / b
        //     5 : % (Modulo or remainder) a % b


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter operator");

        System.out.println("1 : + ");
        System.out.println("2 : - ");
        System.out.println("3 : * ");
        System.out.println("4 : / ");
        System.out.println("5 : % ");

        int operator = sc.nextInt();

        switch(operator){
            case 1 : System.out.println("Additionum is : " + (a+b));
            break;

            case 2 : System.out.println("Subtraction is : " + (a-b)); 
            break;

            case 3 : System.out.println("Multiplication is : " + (a*b));
            break;

            case 4 : System.out.println("Division is : " + a/b);
            break;

            case 5 : System.out.println("Modulus is : " + a%b);
            break;

            default: System.out.println("Enter a valid operator");

        }


    }
}
