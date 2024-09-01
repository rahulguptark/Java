import java.util.Scanner;

public class Prime {

    public static void checkPrime(int n){
    
        if(n < 2){
            System.out.println("Number is not prime");
        }

        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                System.out.println("Number is not prime: ");
                break;
            }
            else{
                System.out.println("Number is prime: ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        checkPrime(num);


    }
}
