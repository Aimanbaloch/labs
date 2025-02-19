public class QuickSort {
    private static int partition(int[] arr, int low, int high) {
        int p = arr[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {
            if (arr[j] < p) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array using Quick Sort:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
