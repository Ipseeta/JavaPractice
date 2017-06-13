package practiceproject;

import java.util.Scanner;

public class StringUpperLower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String enteredString = s.nextLine();
		StringBuilder sb = new StringBuilder(enteredString);
		char ch;
		for(int i=0;i<enteredString.length();i++){
			if(' '!=sb.charAt(i)){
				if(i%2==0){
					ch= Character.toUpperCase(sb.charAt(i));
					sb.setCharAt(i, ch);
				}else{
					ch= Character.toLowerCase(sb.charAt(i));
					sb.setCharAt(i, ch);
				}
			}
			//newString = enteredString.substring(0,i+1).toUpperCase()+enteredString.substring(i+2).toLowerCase();
			//System.out.println(sb);
		}
		System.out.println("Final   "+sb);
	}

}
