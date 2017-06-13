package practiceproject;
import java.util.*;

public class BomberAlgo{
  public static void main(String[] args){
	  System.out.println("Enter string: ");
   Scanner s = new Scanner(System.in);
   String input = s.nextLine();
   System.out.println("Input: "+input);
   BomberAlgo bomberAlgoObj = new BomberAlgo();
   String result="";
   bomberAlgoObj.getFormattedOutput(result,input);
   System.out.println("Output: "+result);
   
}
public String getFormattedOutput(String result,String input){
	
 for(int i=0;i<input.length();i++){
	 if(input.length()<3){
		 result = input;
			return result;
		}
  if(input.length()> (i+2) && input.charAt(i)==(input.charAt(i+1)) && input.charAt(i+1)==(input.charAt(i+2))){
if(i==0){
	result = getFormattedOutput(result,input.substring(3));
  return result;}
else{
	result = getFormattedOutput(result,input.substring(0,i)+ input.substring(i+3));
return result;
}
}}
  return result;
 
 //return "";
}

}