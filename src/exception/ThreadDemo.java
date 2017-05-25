package exception;

import java.util.*;

/**
 * Created by ipseeta on 5/25/17.
 */
public class ThreadDemo {
    class A {
    }

    class B extends A {
    }

    class C extends B {
    }

    public static void main(String args[]) {
        ArrayList<A> x = new ArrayList<A>();
        ArrayList<B> a = new ArrayList<B>();
        // x.add(new A());
        // a = (ArrayList<B>)x;
        // a.add(new B());
        ArrayList b = a;
        ArrayList<C> c = (ArrayList<C>) b;
        //  c.add(new C());
    }
}

