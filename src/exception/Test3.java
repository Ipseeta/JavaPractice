package exception;

/**
 * Created by ipseeta on 5/25/17.
 */
public class Test3 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        int i = t.check();
        System.out.println(i);
    }

    private int check() {
        try {
            System.out.println("try block");
            System.exit(0);
            return 1;
        } catch (Exception e) {
            System.out.println("catch block");
            return 2;
        } finally {
            System.out.println("finally returning");
            return 3;
        }
    }
}

