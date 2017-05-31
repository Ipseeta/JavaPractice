package outputs;

/**
 * Created by ipseeta on 5/25/17.
 */
public class Foo {
    public void foo(boolean a,boolean b){
        if(a){
            System.out.println("A");
        }
        else if(a && b){
            System.out.println("A && B");
        }
        else{
            if(!b){
                System.out.println("notB");
            }
            else{
                System.out.println("ELSE");
            }
        }
    }
    public static void main(String args[]){
        Foo f = new Foo();
        f.foo(false,true);
    }
}
