package numbers;

import java.util.Scanner;

/**
 * Created by ipseeta on 5/19/17.
 */
public class Same1stNLast {

    public static int find(int x) {
        if (x < 10)
            return x;
        int res = x / 10;
        res = res + 9;
        String st = Integer.toString(x);

        int len = st.length();
        if ((st.charAt(0) - 48) > (st.charAt(len - 1) - 48))
            res--;
        return res;
    }

    public static int findnumsame(int a, int b) {
        return find(b) - find(a - 1);
    }

    public static void main(String[] args) {
        int k = 0;
        Scanner inp = new Scanner(System.in);
        k = inp.nextInt();
        for (int x = 0; x < k; x++) {
            int a = inp.nextInt();
            int b = inp.nextInt();
            // System.out.println("hey");
            System.out.println(findnumsame(a, b));
        }
    }
}


