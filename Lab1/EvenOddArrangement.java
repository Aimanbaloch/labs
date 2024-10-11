import java.util.Scanner;

public class EvenOddArrangement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        arrangeNumbers(numbers);

        System.out.println("Arranged numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void arrangeNumbers(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            while (left < right && numbers[left] % 2 == 0) {
                left++;
            }
            while (left < right && numbers[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
            }
        }
    }
}