import java.util.Scanner;

public class RotInvHalfPyramid {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Outer loop
        for(int i=1; i<=n; i++){
            // Inner loop ->  print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -> print star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
