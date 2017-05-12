package sort;
/*
 * The selection sort algorithm sorts an array by repeatedly 
 * finding the minimum element (considering ascending order) from unsorted part 
 * and putting it at the beginning. The algorithm maintains two subarrays in a given array.
1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.
Time Complexity: O(n2) as there are two nested loops.
Auxiliary Space: O(1)
 */
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			int minIdx=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[minIdx])
					minIdx = j;
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
