import java.util.Scanner;

public class InsertElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n+1];

        System.out.println("Enter the values");

        // Take input from the user

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt(); // arr1[0], arr1[1]
        }
        
        // To print the array

        System.out.println("Enter the index where the new value to inserted");
        int idx = sc.nextInt(); // index: 2


        System.out.println("Enter the new value to inserted");
        int p = sc.nextInt(); // new value to be inserted

        for(int i=0; i<n+1; i++){ // arr1[] = {10, 20, 30, 40, 50} idx = 2
                                  // arr2[] = {10, 20, 80, 30, 40, 50}
            if(i < idx){
               arr2[i] = arr1[i];
            }
            else if(i == idx){
                arr2[i] = p;
            }
            else{
                arr2[i] = arr1[i-1];
            }
        }

        System.out.println("Elements are: ");
        for(int i=0; i<n+1; i++){
            System.out.println(" " +  arr2[i]);
        }


    }
}
