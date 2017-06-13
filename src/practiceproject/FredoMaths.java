package practiceproject;

import java.util.Scanner;

public class FredoMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int x=0;
		int k=0;
		int m=0;
		if(T>=1 && T<=Math.pow(10, 5)){
			for(int i=0;i<T;i++){
				x=sc.nextInt();
				k =sc.nextInt();
				m = sc.nextInt();
				if(m>=1 && m<=Math.pow(10, 7) && k>=1 && k<=Math.pow(10, 18) && x>m && x<=Math.pow(10,8) && prime(x)){
					int res = pow(x, k) % m;
					System.out.println(res);
				}
			}
		}

	}
	static int pow(int base, int power){
		int baseRes=base;
		if(power == 0) return 1;
		//if(power == 1) return base;
		for(int i=1;i<power;i++){
			baseRes= (int) Math.pow(baseRes, base);
			/*if(i==power){
				return baseRes;
			}*/
		}
		return baseRes;
	}
	static boolean prime(int number){
	for(int i=2; i<=number/2; i++){
        if(number % i == 0){
            return false;
        }
    }
	return true;
	}
}
