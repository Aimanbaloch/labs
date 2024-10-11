import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        long startTime = System.nanoTime();  
        if (N < 1) {
            System.out.println("N must be a positive integer.");
        } else {
            System.out.print("Fibonacci Series (Recursive): ");
            for (int i = 0; i < N; i++) {
                System.out.print(fib(i) + " ");
            }
        }
        long endTime = System.nanoTime();  
        long timeTaken = endTime - startTime;
        System.out.println("\nTime taken (Recursive): " + timeTaken + " nanoseconds.");
        
        sc.close();
    }
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
