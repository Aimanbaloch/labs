import java.util.Random;
import java.util.Scanner;
public class IterativeSearch {
    public static int searchIterative(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return 1;  
            }
        }return 0;  
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = 100000;  
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000);  
        }
        System.out.print("Enter a value to search: ");
        int target = scanner.nextInt();
        long startTime = System.nanoTime();
        int result = searchIterative(arr, target);
        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;
        System.out.println("Result (Iterative): " + result);
        System.out.println("Time taken (Iterative): " + timeTaken + " nanoseconds.");
        scanner.close();
    }
}
