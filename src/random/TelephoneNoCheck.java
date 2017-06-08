package random;

import java.util.Scanner;

/**
 * Created by ipseeta on 6/8/17.
 */
public class TelephoneNoCheck {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String no = sc.next();
        if(Utility.isTeleNo(no) && no.length()==10) System.out.println("Yes it's a telephone no");
        else System.out.println("No it's not a telephone no");
    }

}
