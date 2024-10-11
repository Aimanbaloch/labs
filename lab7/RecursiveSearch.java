import java.util.Random;
import java.util.Scanner;
public class RecursiveSearch {
    public static int searchRecursive(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return 0;  
        }
        if (arr[index] == target) {
            return 1;  
        }
        return searchRecursive(arr, target, index + 1);  
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
        int result = searchRecursive(arr, target, 0);
        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;
        System.out.println("Result (Recursive): " + result);
        System.out.println("Time taken (Recursive): " + timeTaken + " nanoseconds.");
        scanner.close();
    }
}
