import java.util.Scanner;

public class CountSum {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the count of number: ");

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        System.out.println("Enter the numbers: ");
        int number, sum = 0;
        for(int i=0; i<count; i++){
            number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println("The sum of all these number is: " + sum);
    }
}
