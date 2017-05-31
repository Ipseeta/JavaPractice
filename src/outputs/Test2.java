package outputs;

/**
 * Created by ipseeta on 5/25/17.
 */
public class Test2{
    public static void main(String as[]){
        System.out.println("value ="+switchIt(4));
    }
    public static int switchIt(int x){
        int j=1;
        switch(x){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }
}