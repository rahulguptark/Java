public class InsertionSort {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        // Indertion Sort -> In insertion sort the array is divided into two parts sorted and unsorted part the elements from the unsorted parts are compared and inserted into sorted part at their proper position one by one.

        // Time Complexity = O(n^2)

        int arr[] = {7, 8, 3, 1, 2};

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            // Placement
            arr[j+1] = current;
        }

        printArray(arr);
    }
}
