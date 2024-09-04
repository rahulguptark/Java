import java.util.Scanner;

public class FoundXr {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take input the number of rows and colums from user
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int numbers[][] = new int[rows][columns];

        // Take input the elements of 2d array

        System.out.println("Enter the values of rows: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // Take input the number which user want to search in 2d array

        System.out.println("Enter the X you want to search: ");

        int x = sc.nextInt();

        // Output 

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(numbers[i][j] == x){
                    System.out.println(x + " found at index  (" + i + "," + j + ")");
                }
            }
        }

    }
}
