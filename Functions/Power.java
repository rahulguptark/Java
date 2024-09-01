// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;


public class Power {

    public static int power(int x, int n){
    
        int pow = 1;
    
        for(int i=0; i<n; i++){
            pow = pow * x;
        }
    
        return pow;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.print("Wnter the value of n: ");
        int n = sc.nextInt();

        System.out.println("The value of x raise to power n is: " + power(x, n));
    }
}
