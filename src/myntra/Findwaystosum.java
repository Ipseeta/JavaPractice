package myntra;

import java.util.*;

/**
 * Created by ipseeta on 10/23/17.
 * int func(int min, int max, int sum);

 write the code to count the number of ways the sum can be obtained using the values find between min and max(both inclusive )
 Example : int func(1,3,5) Output : 5
 1+1+1+1+1 ,
 1+1+1+2
 1+1+3
 2+3
 1+2+2
 */
public class Findwaystosum {
//    public static void main(String[] args) {
//        func(1,3,5);
//    }
//
//    private static void func(int min, int max, int sum) {
//        //System.out.println("Output : "+sum);
//        int counter = 0;
//
//    }
static Map<String,List<Integer>> store = new HashMap<>();
    // Function prints all combinations of numbers 1, 2, ...MAX_POINT
    // that sum up to n.
    // i is used in recursion keep track of index in arr[] where next
    // element is to be added. Initital value of i must be passed as 0
    static void printCompositions(int arr[], int n, int i)
    {
        int MAX_POINT = 3;
        if (n == 0)
        {
            printArray(arr, i);
        }
        else if(n > 0)
        {
            for (int k = 1; k <= MAX_POINT; k++)
            {
                arr[i]= k;
                printCompositions(arr, n-k, i+1);
            }
        }
    }

    // Utility function to print array arr[]
    static void printArray(int arr[], int m){
    ArrayList<Integer> value= new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            value.add(arr[i]);
//            if (i==m-1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + "+");
//            }
        }

        if(!store.containsValue(value)) {
            int storeCount = store.size();
            store.put("way " + (storeCount + 1), value);
        }
    }


    // Driver program
    public static void main (String[] args)
    {
        int n = 5;
        int size = 100;
        int[] arr = new int[size];
        System.out.println("Different compositions formed by 1, 2 and 3 of "+ n + " are");
        printCompositions(arr, n, 0);
        store.entrySet().stream().forEach(item ->
                System.out.println(item.getKey() + ": " + item.getValue())
        );
    }
}
