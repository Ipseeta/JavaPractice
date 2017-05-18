package sort;

/**
 * Created by ipseeta on 5/18/17.
 * (n-1)+(n-2)+(n-3)+.....+3+2+1
 Sum = n(n-1)/2
 i.e O(n2)
 */
public class BubbleSort_On2 {
    public static void main(String args[]){
        int arr[]={1,2,9,7,6};
        int n = arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i);
        }
    }
}
