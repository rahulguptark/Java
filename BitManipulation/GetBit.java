import java.util.Scanner;

    // Get the 3rd bit(position = 2) of a number n.(n = 0101)
    // Get bit
    // steps:-
    // 1. BitMask : 1<<position
    // 2. Operation: AND

public class GetBit{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Enter the position of the bit you want to check: ");
        int pos = sc.nextInt();

        int bitMask = 1<<pos;

        if((bitMask & n) == 0) {
            System.out.println("Bit was zero ");
        }
        else {
            System.err.println("Bit was one ");
        }



    }
}