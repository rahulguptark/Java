import java.util.Scanner;

public class PallindromicPattern {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){

            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // 1st half numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // 2nd half numbers
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
