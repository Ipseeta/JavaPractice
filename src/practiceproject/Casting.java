package practiceproject;

public class Casting {
	int z=40;

	public static void main(String[] args) {
		long x =40002;
		short y = (short) x;
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		int a =3;
		float b = a;
		double c = a;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Value of c is "+c);
		//System.out.println(z);compile time issue.Cannot make a static reference to a non static variable
	}

}
