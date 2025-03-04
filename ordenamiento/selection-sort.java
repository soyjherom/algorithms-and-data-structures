public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1, 1, 4};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }       
    }
}
