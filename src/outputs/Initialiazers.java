package outputs;

/**
 * Created by ipseeta on 5/25/17.
 */
class Initializers{
    static
    {
        System.out.print("1 ");
    }
    private Initializers()
    {
        System.out.print("2 ");
    }
    {
        System.out.print("3 ");
    }
    public static void main(String args[])
    {
        new Initializers();
    }
}
