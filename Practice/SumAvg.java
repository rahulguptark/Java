public class SumAvg {
    
    public static void main(String[] args) {
        int arr[] = {11, 12, 18, 14};
        int length = arr.length;

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements of array is: " + sum);


        float avg = (float) sum / length;
        System.out.println(" Avg of elements of array is: " + avg);
    }
}
