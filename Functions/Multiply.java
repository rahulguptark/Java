import java.util.Scanner;

public class Multiply {

    public static int multiplyTwoNums(int a, int b){
        return a * b;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Multiplication of two number is: " + multiplyTwoNums(num1, num2));


    }
}
