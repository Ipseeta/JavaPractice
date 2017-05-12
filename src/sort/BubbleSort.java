package sort;
/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly 
 * swapping the adjacent elements if they are in wrong order.
 * @author ipseeta
 *
 */
/*
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
Auxiliary Space: O(1)
 */
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
	}

}
