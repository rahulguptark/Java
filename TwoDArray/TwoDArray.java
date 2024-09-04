import java.util.Scanner;

public class TwoDArray {
    
    public static void main(String args[]){

        // Take input from the user 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();

        int numbers[][] = new int[row][column];

        // Input in 2d array
        
        // Take elements of row
        for(int i=0; i<row; i++){
            // Take elements of column
            for(int j=0; j<column; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
