import java.util.*;
public class Input {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // To input a single word we use next()
        String str = sc.next();
        System.out.println(str);

        // To input a complete sentence or multiple lines we use nextLine()
        String str2 = sc.nextLine();
        System.out.println(str2);

        // To input an integer value we use nextInt()
        int num = sc.nextInt();
        System.out.println(num);

        // To input a float value we use nextFloat()
        float price = sc.nextFloat();
        System.out.println(price);

    }
}

// Input in Java:-

// next - To input a single word
// nextLine - To input multiple words or sentences
// nextInt - To input integer values
// nextByte - To input byte values 
// nextFloat - To input float values
// nextDouble - To input double values
// nextBoolean - To input boolean values
// nextShort - To input short values
// nextLong - To input long values