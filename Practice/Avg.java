import java.util.Scanner;

public class Avg {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count of numbers: ");
        int count = sc.nextInt();

        System.out.println("Enter the numbers: ");

        int sum = 0, numbers;
        float avg = 0;
        for(int i=0; i<count; i++){
            numbers = sc.nextInt();
            sum = sum + numbers;
        }
        avg = sum / count;
        System.out.println("Sum of enetered numbers is: " + sum);
        System.out.println("Average of enetered numbers is: " + avg);


    }
}
