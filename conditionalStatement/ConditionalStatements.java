import java.util.Scanner;

public class ConditionalStatements {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();
        
        // if (age > 18) {
        //     System.out.println("You are an adult");
        // }
        // else{
        //     System.out.println("You are not an adult");
        // }

        // Check whether the number is odd or even

        // int num = sc.nextInt();

        // if(num % 2 == 0){
        //     System.out.println("number is even");
        // }
        // else{
        //     System.out.println("number is odd");
        // }


        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a == b){
        //     System.out.println("both are equal");
        // }
        // else{
        //     if(a > b) {
        //         System.out.println("a is greater");
        //     }
        //     else{
        //         System.out.println("a is lesser");
        //     }
        // }


        // if(a == b){
        //     System.out.println("both are equal");
        // }
        // else if(a > b) {
        //         System.out.println("a is greater");
        //     }
        // else{
        //         System.out.println("a is lesser");
        // }


        int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        // }
        // else if(button == 2){
        //     System.out.println("Namaste");
        // }
        // else if(button == 3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid Button");
        // }

        switch(button){
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Namaste");
            break;

            case 3: System.out.println("Bonjour");
            break;

            default: System.out.println("Invalid Button");
        }
    }
}
