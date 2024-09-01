// the address of the memory is stored in hexadecimal form
// In java the array is automatically initialized with null value (0)
import java.util.Scanner;

public class PrintMarks {
    
    public static void main(String[] args) {
        
        // int[] marks = new int[3];
        // int marks[] = new int[3];

        // Declaration of array

        // int marks[] = {98, 96, 97};

        // marks[0] = 98; // physics
        // marks[1] = 96; // chemistry
        // marks[2] = 97; // English

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        
        int numbers[] = new int[size];

        System.out.println("Enter the elements of array: ");

        // Input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // Output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}
