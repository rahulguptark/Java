import java.util.Scanner;

public class HalfPyramidNumber {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Outer loop
        for(int i=1; i<=n; i++){
            // Inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
