import java.util.Scanner;

public class SolidRectangle{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of rectangle: ");
        int breadth = sc. nextInt();

        // Outer loop
        for(int i=1; i<=length; i++){
            // Inner oop
            for(int j=1; j<=breadth; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}