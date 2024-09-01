// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Average {
    
    public static int avg(int a, int b, int c){
        int average = (a + b + c)/3;
        return average;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("Average of the three number is: "+ avg(a, b, c));
    }
}
