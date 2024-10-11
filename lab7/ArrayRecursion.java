import java.util.Scanner;

public class ArrayRecursion {
    static void printForward(char[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printForward(arr, index + 1);
    }
    static void printReverse(char[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the character array: ");
        int size = scanner.nextInt();
        char[] charArray = new char[size];
        System.out.println("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        System.out.println("Array in forward direction:");
        printForward(charArray, 0);
        System.out.println("\nArray in reverse direction:");
        printReverse(charArray, size - 1);

        scanner.close();
    }
}
