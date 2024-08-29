import java.util.Scanner;

public class TypeConversion {
    
    public static void main(String[] args) {
        
        // Type conversion is also known as widening conversion and it is also known as implicit conversion (apne aap)
        // Conversion from int to long 

        int a = 10;
        long b = a;

        // System.out.println(b);

        // Converion from long to int generates an error : possible lossy conversion from long to int

        // long c  = 10;
        // int d = c;

        // System.out.println(d);


        // Conversion happens when these two conditions are met:
        // 1. type compatible
        // 2. destination type >  source type

        // byte -> short -> int ->float -> long -> double


        Scanner sc = new Scanner(System.in);
        // int num = sc.nextFloat();

        float num = sc.nextInt();

        System.out.println(num);

    }
}
