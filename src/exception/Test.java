package exception;
import java.io.IOException;
/**
 * Created by ipseeta on 5/25/17.
 */
public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        int i = t.check();
        System.out.println(i);
    }
    private int check(){
        try{
            throw new IOException();
        }catch(Exception e){
            System.out.println("catch block");
            return 1;
        }finally{
            System.out.println("finally returning");
            return 2;
        }
    }
}