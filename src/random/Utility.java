package random;

/**
 * Created by ipseeta on 6/8/17.
 */
public class Utility {
    public static boolean isTeleNo(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}