import java.util.Scanner;

public class AscDescRecursion {
    static void printAscending(int current, int N) {
        if (current > N) {
            return;
        }
        System.out.print(current + " ");
        printAscending(current + 1, N);
    }
    static void printDescending(int current) {
        if (current < 1) {
            return;
        }
        System.out.print(current + " ");
        printDescending(current - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        System.out.println("Numbers in ascending order:");
        printAscending(1, N);
        System.out.println("\nNumbers in descending order:");
        printDescending(N);
        
        scanner.close();
    }
}
