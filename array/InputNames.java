// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class InputNames {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take input the size of array from users
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        
        String names[] = new String[size];
        
        // Input the names from the user

        System.out.print("Enter the names: ");
        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }

        // Print the names on the screen 
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}
