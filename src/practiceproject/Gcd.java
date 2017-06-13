package practiceproject;

import java.util.*;
class Gcd
    {
        public static void main(String args[])throws Exception
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the First no : ");
            int n1=sc.nextInt();
            System.out.print("Enter the Second no : ");
            int n2=sc.nextInt();
            int r;
            int count =0;
            double cond =Math.pow(10,12);
             
            while(n2 != 0 && n1>=1 && n2>=1 && n1 <= cond && n2 <= cond  )
            {
                r = n1 % n2;
                n1 = n2;
                n2 = r;
                count++;
            }
            if(count!=0){
            	count = count-1;
            }
            System.out.println("GCD = "+n1);
            System.out.println("Count = "+(count));
        }
    }