package practiceproject;

public class MethodOverloadingEx {

	public static void main(String[] args) {
		MethodOverloadingEx ex = new MethodOverloadingEx();
		ex.call(null);
	}
	public void call(Object o){
		System.out.println("Object");
	}
	public void call(String s){
		System.out.println("String");//This is printed
	}

}
