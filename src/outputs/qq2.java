package outputs;

/**
 * Created by ipseeta on 5/25/17.
 */
public class qq2{
    public static void main(String as[]){
        System.out.println(method());
    }
    public static int method(){
        try{
            throw new ClassNotFoundException();
        }catch(Exception e){
            throw new NullPointerException();
        }
    }
}