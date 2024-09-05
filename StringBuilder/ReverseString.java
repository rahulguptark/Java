// This code runs from 0 to n/2 and 1/2 is a constant which we can ignore therefore the time complexity of this code is O(n).

public class ReverseString {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("hello");
        
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
    }
}
