// Take an array as an input from the user. Search for a given number x and print the index at which it occurs.

import java.util.Scanner;

public class InputArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        // size of array
        int number[] = new int[size];

        // Enter the elements of array

        System.out.print("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        // Take input from the user the number which he wants to search in the array

        System.out.print("Enter the number you want to find: ");
        int x = sc.nextInt();

        for(int i=0; i<number.length; i++){
            if(number[i] == x){
                System.out.println(x + " found at the index : " + i);
                break;
            }
            else{
                System.out.println("x is not found");
            }
        }
    }
}
