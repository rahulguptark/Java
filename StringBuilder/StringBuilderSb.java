import java.util.*;

public class StringBuilderSb{
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Spider Man");
        System.out.println(sb);

        // Char at index
        System.out.println(sb.charAt(0));

        // Set char at index 0
        sb.setCharAt(0, 'X');
        System.out.println(sb);

        // Insert a character at any index
        sb.insert(0, 'S');
        sb.insert(6, 'r');
        System.out.println(sb);

        // Delete the extra r
        sb.delete(7, 8);
        System.out.println(sb);

        // Append in the string

        StringBuilder s = new StringBuilder("h");
        s.append("e");
        s.append("l");
        s.append("l");
        s.append("o");
        System.out.println(s);
        System.out.println(s.length());

    }
}