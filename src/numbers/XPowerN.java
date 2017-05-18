package numbers;

/**
 * Created by ipseeta on 5/18/17.
 */
public class XPowerN {
    private static int power(int x,int y){
        if(y==0)
            return 1;
        if(y%2==0)
            return power(x,y/2)*power(x,y/2);
        else
            return x*power(x,y/2)*power(x,y/2);
    }
    public static void main(String args[]){
        System.out.print(XPowerN.power(2,3));
    }
}
