
// Clear Bit
// Clear the 3rd bit (position = 2) of a number n. (n = 0101)
// Steps:-
// 1. BitMask: 1<<position
// 2. Operation: AND with NOT
public class ClearBit {
    
    public static void main(String[] args) {
        
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }
}
