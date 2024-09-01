// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class Count {
    
    public static void main(String[] args) {

        int positive = 0;
        int negative = 0; 
        int zeros = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to continue and 0 to stop: ");
        int choice = sc.nextInt();

        while(choice == 1){
            System.out.println("Enter your number: ");
            int number = sc.nextInt();

            if(number > 0){
                positive++;
            }
            else if(number < 0){
                negative++;
            }
            else{
                zeros++;
            }

            System.out.println("Enter 1 to continue and 0 to stop: ");
            choice = sc.nextInt();
        }

        System.out.println("positives: " + positive );
        System.out.println("negatives: " + negative);
        System.out.println("zeros: " + zeros);

    }
}
