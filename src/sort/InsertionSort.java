package sort;
//Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
/*
 * Time Complexity: O(n*n)
Auxiliary Space: O(1)
 */
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		int n = arr.length;
        for (int i=1; i<n; ++i){
            int key = arr[i];
            int j = i-1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for(int i=0;i<n;i++){
        	System.out.print(arr[i]+" ");
        }
	}

}
