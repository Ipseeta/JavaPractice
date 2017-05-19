package sort;

/**
 * Created by ipseeta on 5/19/17.
 * Worst Case Time Complexity : O(n2)
 Best Case Time Complexity : O(n log n)
 Average Time Complexity : O(n log n)
 Space Complexity : O(n log n)
 */
public class QuickSort {
    public static void main(String args[]) {
        int arr[] = {6, 17, 8, 14, 63, 25, 37, 52};
        for (int i : quicksort(arr,0,arr.length-1))
            System.out.print(i+" ");
    }


    private static int[] quicksort(int arr[], int f, int l) {
        if (f < l) {
            int q = partition(arr, f, l);
            quicksort(arr, f, q);
            quicksort(arr, q + 1, l);
        }
        return arr;
    }

    private static int partition(int[] arr, int f, int l) {
        int i, j, pivot, temp;
        pivot = arr[f];
        i = f;
        j = l;
        while (arr[i] < pivot && arr[i] != pivot)
            i++;
        while (arr[j] > pivot && arr[j] != pivot)
            j--;
        if (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            return j;
        }
        return j;
    }
}
