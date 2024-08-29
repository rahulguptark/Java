import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // To take input only a single word we use next()

        System.out.println("Enter your name");
        String name1 = sc.next();

        System.out.println("Your name is " + name1);

        // To take input more than on word we use nextLine()

        System.out.println("Enter your name");
        String name2 = sc.nextLine();

        System.out.println("Your name is: " + name2);

        // To take a number as an input we use nextInt()

        System.out.println("Enter any number");
        int num = sc.nextInt();

        System.out.println("You have entered: " + num);

        // To enter float values we use nextFloat()

        System.out.println("Enter the price of anything");
        float price = sc.nextFloat();
        System.out.println("Price is: " + price);
    }
}


// Input in java
// next
// nextLine
// nextInt
// nextByte
// nextFloat
// nextDouble
// nextBoolean
// nextShort
// nextLong