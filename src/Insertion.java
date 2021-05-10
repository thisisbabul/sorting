public class Insertion {
    public static void main(String[] args) {
        int arr[] = {5, 7, 2, 1, 9, 3, 4, 6, 8};
        doSort(arr);
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void doSort(int[] arr) {
        int i, j, item;
        for (i = 1; i < arr.length; i++) {
            item = arr[i];

            j = i - 1;
            while (j >= 0 && arr[j] > item) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = item;
        }
    }
}
