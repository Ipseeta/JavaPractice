package basics;

/**
 * Created by ipseeta on 6/7/17.
 */
public class CopyConstructorTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"X","Senior Software Engineer",24);
        Employee copyConstructor = new Employee(employee);
        System.out.println(copyConstructor.toString());
    }
}
