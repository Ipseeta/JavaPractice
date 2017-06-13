package practiceproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class goal is to determine which things to put into the package 
 * so that the total weight is less than or equal to the package limit and the total cost is as large as possible.
 * @author Ipseeta
 *
 */
public class PackageProblem {
	/**
	 * This method populates list of things that is index,weight and cost by comparing it with max weight.
	 * @param sub2 is the index with weight and cost like ([(1,53.38,$45), (2,88.62,$98), (3,78.48,$3), (4,72.30,$76), (5,30.18,$9), (6,46.34,$48)])
	 * @param things
	 * @param maxWeight max weight of the thing
	 */
	public static void parseThings(String[] sub2,List<Thing> things,double maxWeight){
		for(int i=0;i<sub2.length;i++)
		{
			String[] sub3=(sub2[i].substring(1,sub2[i].length()-1)).split(",");//[1, 53.38, $45]
			int index=Integer.parseInt(sub3[0]);
			double weight=Double.parseDouble(sub3[1]);
			double cost=Double.parseDouble(sub3[2].substring(1,sub3[2].length()));
			if(weight<=maxWeight)
			{
				Thing thing = new Thing(index,weight,cost);
				things.add(thing);
			}
		}
	}
	/**
	 * This method returns the maximum weight and max cost by combining different wts and costs
	 * @param things
	 * @param index index
	 * @param NmaxWeight
	 * @return
	 */
	static String getOptimumFor(List<Thing> things, int index,int NmaxWeight){
		int indexSolution=0;
		String returnData ="";
		double maxWeight=0;
		double maxCost=0;
		int[] data=new int[index];
		List<Integer> result = new ArrayList<Integer>();
		int[] arr=new int[things.size()];
		for(int i=0;i<things.size();i++){
			arr[i]=i;
		}
		getCombination(arr, data, result, 0, 0);
		for(int i=0;i<=result.size()-index;i+=index){
			double somWeight=0;
			double somCost=0;
			for(int j=0;j<index;j++){
				somWeight+=things.get(result.get(i+j)).getWeight();
				somCost+=things.get(result.get(i+j)).getCost();
			}
			if(somWeight<=NmaxWeight){
				if((somCost>maxCost)||((somCost==maxCost)&&(somWeight<=maxWeight))){
					indexSolution=i;
					maxWeight=somWeight;
					maxCost=somCost;
				}
			}
		}
		for(int k=indexSolution;k<index+indexSolution;k++){
			returnData+=result.get(k)+",";
		}
		return returnData+maxCost+","+maxWeight;
	}
	/**
	 * This helps to get all the combination of indexes in result param
	 * @param arr
	 * @param data
	 * @param result
	 * @param start
	 * @param index
	 */
	static void getCombination(int arr[], int data[],List<Integer> result, int start, int index){
		if (index == data.length){
			for (int j=0; j<data.length; j++){
				result.add(data[j]);
			}
			return;
		}
		for (int i=start; i<arr.length && arr.length-i >= data.length-index; i++){
			data[index] = arr[i];
			getCombination(arr, data,result, i+1, index+1);
		}
	}
	public static void main (String[] args) {
		File file = new File("C://Users//Ipseeta//Desktop//packageproblem.txt");
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		String line;
		List<Thing> things=new ArrayList<Thing>();
		try {
			while ((line = in.readLine()) != null) {
				String s="";
				//Parsing line
				String[] sub1=line.split(" : ");
				int N=Integer.parseInt(sub1[0]);//N is the weight that the package can take
				String[] sub2=sub1[1].split(" ");
				if(sub2.length>1){
					things.clear();
					parseThings(sub2,things,N);

					double maxCost=0;
					double maxWeight=0;
					for(int i=1;i<=things.size();i++){
						String resultat=getOptimumFor(things,i,N);
						String[] sub4=resultat.split(",");
						double cost=Double.parseDouble(sub4[sub4.length-2]);
						double weight=Double.parseDouble(sub4[sub4.length-1]);
						if(cost==maxCost){
							if(weight<maxWeight){
								maxCost=cost;
								maxWeight=weight;
								s=resultat;
							}
						}
						if(cost>maxCost){
							maxCost=cost;
							maxWeight=weight;
							s=resultat;
						}
					}
					String[] sub5=s.split(",");
					String ss="";
					for(int i=0;i<sub5.length-2;i++){
						ss+=things.get(Integer.parseInt(sub5[i])).getIndex()+",";
					}
					if(ss.equals(""))
						System.out.println("-");
					else
						System.out.println(ss.substring(0,ss.length()-1));
				}else
					System.out.println("-");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
