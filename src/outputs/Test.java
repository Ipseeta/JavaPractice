package outputs;

/**
 * Created by ipseeta on 5/25/17.
 */
public class Test implements Runnable
{
    private int x;
    private int y;
    public static void main(String [] args)
    {
        Test test = new Test();
        (new Thread(test)).start( ); /* Line 9 */
        (new Thread(test)).start( ); /* Line 10 */
    }
    public synchronized void run( ) /* Line 12 */
    {
        for (;;) /* Line 14 */
        {
            x++;
            y++;
            System.out.println("x = " + x + "y = " + y);
        }
    }
}
