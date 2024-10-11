import java.util.Scanner;

public class FactorialIterative {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long startTime = System.nanoTime(); 
            int result = factorial(n);
            long endTime = System.nanoTime();  
            System.out.println("Factorial of " + n + " is: " + result);
            long timeTaken = endTime - startTime;
            System.out.println("Time taken (Iterative): " + timeTaken + " nanoseconds.");
        }
        
        scanner.close();
    }
}
