import java.util.Scanner;

public class IsAscending {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        //Array
        int numbers[] = new int[size];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAscending = false;
            }
        }

        if(isAscending == true){
            System.out.println("The array is sorted in ascending order");
        }
        else{
            System.out.println("the array is not sorted in ascending order");
        }
    }
}
