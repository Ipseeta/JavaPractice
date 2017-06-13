package practiceproject;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string to be reversed::: ");
		String enteredString = s.nextLine();
		StringReversal sr = new StringReversal();
		String newS = sr.reverse(enteredString);
		System.out.println("Reversed String :::::::::::::: "+newS);
	}
	public String reverse(String s){
		if(s.length()==0)
			return "";
		return s.charAt(s.length()-1)+ reverse(s.substring(0,s.length()-1));
	}

}
