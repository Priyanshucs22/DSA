public class Quicksort {
    public static void quicksort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            quicksort(arr, l, pi - 1);
            quicksort(arr, pi + 1, h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[h] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 8, 1 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Worst case occurs and Time Complexity
// when pivot is always Worst : O(n^2)
// the smallest or the Average : O(nlogn)
// largest element.