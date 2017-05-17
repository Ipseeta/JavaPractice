package string;

import java.util.HashSet;
import java.util.Set;

public class SizeOfSet {

	public static void main(String[] args) {
		Set<String> setOfStrings = new HashSet<String>();
		setOfStrings.add("");
		setOfStrings.add(null);
		try{
			System.out.println(setOfStrings.size());
			setOfStrings.removeIf(String :: isEmpty);
		}catch(Throwable t){
			System.out.println("Something is wrong here");
		}

	}

}
