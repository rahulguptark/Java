import java.util.Scanner;

public class Strings {
    
    public static void main(String[] args) {

        // Strings are immutable which means once the string is declared we can not change its value if we want to change its value then we have create new string.
        
        // Take input from the user

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);

        
        
    }
}
