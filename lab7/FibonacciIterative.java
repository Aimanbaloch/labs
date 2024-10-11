import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        long startTime = System.nanoTime(); 
        if (N < 1) {
            System.out.println("N must be a positive integer.");
        } else {
            System.out.print("Fibonacci Series (Iterative): ");
            int first = 0, second = 1;
            for (int i = 1; i <= N; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
        long endTime = System.nanoTime();  
        long timeTaken = endTime - startTime;
        System.out.println("\nTime taken (Iterative): " + timeTaken + " nanoseconds.");
        
        sc.close();
    }
}
