// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Circumference {
    
    public static float circumferenceOfCircle(int r){
        float pi = 3.14f;
        return 2 * pi * r;
    }
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();

        System.out.println(circumferenceOfCircle(r));

    }
}
