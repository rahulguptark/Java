// All the functions are stored in the memory in the form of stack and all the variables of that function are also stored in the same stack frame

import java.util.Scanner;

public class printName {
    
    public static void printMyname(String name){
        System.out.println(name);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        printMyname(name);

    }
}

