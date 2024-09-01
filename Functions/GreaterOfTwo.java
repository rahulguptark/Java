//  Write a function which takes in 2 numbers and returns the greater of those two.


import java.util.Scanner;

public class GreaterOfTwo {

    public static void greaterOfTwo(int a, int b){
        if(a > b){
            System.out.println(a + " is greater");
        }
        else{
            System.out.println(b + " is greater");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        greaterOfTwo(num1, num2);

    }
}
