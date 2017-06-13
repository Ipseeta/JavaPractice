package practiceproject;
/**
 * Each thing you put inside the package has such parameters as index number, weight and cost.
 * @author Ipseeta
 *
 */
public class Thing {
	private int index;
	private double weight;
	private double cost;
	
	public Thing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Thing(int index, double weight, double cost) {
		super();
		this.index = index;
		this.weight = weight;
		this.cost = cost;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Thing [index=" + index + ", weight=" + weight + ", cost=" + cost + "]";
	}
	
	
	

}
