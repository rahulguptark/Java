public class Compare {
    
    public static void main(String[] args) {
        
        // In java strings are objects

        // Compare two Strings 

        // In java two strings are compared as, if there are two strings string1 = hello and string2 = wello then we compare the first character of both the stringsin this case he is smaller then w therefore wello is greater then hello.
        
        // In case if the first character of borth strings is same then we will compare the next characters and so on...

        // Example
        String name1 = "Rahul";
        String name2 = "Rahul";

        // 1. s1 > s2 : +ve value
        // 2. s1 == s2 : 0
        // 3. s1 < s2 : -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }


        // we donot use == operator to compare two strings because it fail in some testcases 

        // Example 

        if(new String("Rahul") == new String("Rahul")){
            System.out.println("String are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // In this case we have stored the same value in both the strings but even then these strings are not equal.
    }
}
