import java.util.Scanner;

public class AddDigits {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find the sum of digits: ");
        int number = sc.nextInt();

        int sum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            sum = sum + lastDigit;
        }
        System.out.println("Sum of all the digits is: " + sum);
    }
}
