import java.util.*;

public class Area {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        float rad = sc.nextFloat();
        float pi = 3.14f;
        float area = pi * rad * rad;

        System.out.println("The area of circle is : " + area);
    }
}
