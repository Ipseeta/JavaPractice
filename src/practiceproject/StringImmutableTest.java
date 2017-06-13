package practiceproject;

public class StringImmutableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String s = "Sachin";
		s.concat("Tendulkar");
		System.out.println(s);//Sachin
		String s1 = new String("Sachin");
		s1.concat("Tendulkar");
		if(s.compareTo(s1)==0){
			System.out.println("equal");//equal
		}
		System.out.println(s1);//Sachin
		s=s.concat("Tendulkar");
		System.out.println(s);//Sachin Tendulkar
		if(s==s1){//false
			System.out.println("hooray");
		}
		if(s.equals(s1)){//true
			System.out.println("hooray matched");
		}
		
		String a = "meow";
		String b = a+"billu";
		String c = "meowbillu";
		if(b.equals(c)){//true but false for ==
			System.out.println("meow billu rocks");
		}*/
		
		String a1="a";
		String a2="a";
		if(a1==a2){
		 System.out.println("a1==a2");
		}
		if(a1.equals(a2)){
			System.out.println("a1 equals a2");
		}
		
		String a3=new String("a");
		if(a1==a3){
		 System.out.println("a1 new == a3");
		}
		if(a1.equals(a3)){
			System.out.println("a1 new equals a3");
		}

	}

}
