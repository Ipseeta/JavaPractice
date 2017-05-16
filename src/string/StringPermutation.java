package string;

public class StringPermutation {

	public static void main(String[] args) {
		perm("123");
	}

	private static void perm(String str){
		perm("",str);
	}

	private static void perm(String prefix, String str) {
		if(null!=str){
			int n = str.length();
			if(n == 0) System.out.println(prefix);
			else{
				for(int i=0;i<n;i++){
					perm(prefix + str.charAt(i), str.substring(0, i)+str.substring(i+1, n));
				}
			}
		}
	}
}
