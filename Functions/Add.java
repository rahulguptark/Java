// Make a function to add two numbers and return the sum

import java.util.Scanner;


public class Add {

    public static int addTwoNums(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = addTwoNums(num1, num2);
        System.out.println("Sum of two numbers is: " + sum);

    }
}
