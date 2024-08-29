import java.util.Scanner;

public class ForLoop {
    
    public static void main(String[] args) {
        
        // i++ =>  i = i + 1

        // for(int i = 0; i < 100; i++){
        //     System.out.println("Hello World!");
        // }

        // for(int i=0; i<11; i++){
        //     System.out.print(i + " ");
        // }

        // Print the sum of first n natural numbers

        // int sum = 0;
        // for(int i=0; i<5; i++){
        //     sum = sum + i;
        // }
        // System.out.println("Sum is: " + sum);


        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // int sum = 0;
        // for(int i=0; i<=n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);


        // Print the table of a number entered by the user

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number:");
        // int n = sc.nextInt();

        // for(int i=1; i<11; i++){
        //     System.out.println(i*n);
        // }


        // for(; ;) {
        //     System.out.println("Apna College");
        // }


        // Print all the even numbers till n

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc. nextInt();

        for(int i=0; i<n; i++){

            if(i % 2 == 0){
                System.out.println(i);
            }
           
        }
    }
}
