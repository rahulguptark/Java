public class CharAtIndex {
    
    public static void main(String[] args) {
        
        String firstName = "Rahul";
        String lastName = "Gupta";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // CharAt
        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }
    }
}
