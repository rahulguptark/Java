
public class Substring {
    
    public static void main(String[] args) {
        
        // substring(begining index, ending, index)

        // In substring the ending index in non inclusive its exclusive which means it doesnot include the last index, 
        
        // if you enter begining index = 0 and ending index = 5 then it will give you the substring from index 0 to index 4

        String sentence = "Hello there!";

        String one = sentence.substring(0, 5);
        System.out.println(one);

        String two = sentence.substring(6);
        System.out.println(two);
    }
}
