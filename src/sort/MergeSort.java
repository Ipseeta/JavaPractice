package sort;

/**
 * Created by ipseeta on 5/19/17.
 * Worst Case Time Complexity : O(n log n)
 Best Case Time Complexity : O(n log n)
 Average Time Complexity : O(n
 */
public class MergeSort {
    public static void main(String[] args) {
        int a[] = {32, 45, 67, 2, 7};
        MergeSort ms = new MergeSort();
        ms.mergesort(a, 0, a.length - 1);
        for (int i : a)
            System.out.print(i + " ");
    }


    private void mergesort(int a[], int p, int r) {
        double q;
        if (p < r) {
            q = Math.floor((p + r) / 2);
            mergesort(a, p, (int) q);
            mergesort(a, (int) (q + 1), r);
            merge(a, p, (int) q, r);
        }
    }

    private void merge(int a[], int p, int q, int r) {
        int b[] = new int[5];     //same size of a[]
        int i, j, k;
        k = 0;
        i = p;
        j = q + 1;
        while (i <= q && j <= r) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];       // same as b[k]=a[i]; k++; i++;
            } else {
                b[k++] = a[j++];
            }
        }

        while (i <= q) {
            b[k++] = a[i++];
        }

        while (j <= r) {
            b[k++] = a[j++];
        }

        for (i = r; i >= p; i--) {
            a[i] = b[--k];        // copying back the sorted list to a[]
        }

    }
}
