import java.util.Scanner;

public class DeleteElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n-1];

        System.out.println("Enter the values");

        // Take input from the user

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt(); // arr1[0], arr1[1]
        }
        
        // To print the array

        System.out.println("Enter the index of value to be deleted");
        int idx = sc.nextInt(); // index: 2

        for(int i=0; i<arr1.length; i++){ // a[] = {10, 20, 30, 40, 50} idx = 2
                                          // b[] = {10, 20, 40, 50}
            if(i<idx){
                arr2[i] = arr1[i];
            }
            else if(i == idx){
                continue;
            }
            else{
                arr2[i-1] = arr1[i];
            }
        }

        System.out.println("Elements are: ");
        for(int i=0; i<n-1; i++){
            System.out.println(arr2[i]);
        }

    }
}
