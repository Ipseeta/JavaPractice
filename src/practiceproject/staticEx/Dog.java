package practiceproject.staticEx;

public class Dog extends Animal{
	static void doStuff(){
		System.out.println("d ");
	}
	void run(){
		System.out.println("Dog running");
	}
	public static void main(String[] args){
		//Dog d1 = (Dog) new Animal();class cast
		//Animal animal[] = {new Animal(),new Dog(),new Animal()};
		/*for(Animal a :animal){
			a.doStuff();
		}*/
		Animal a = new Dog();
		Dog d= (Dog)a;
		//Dog dog[]= {d,new Dog()};
		d.doStuff();
		Dog.doStuff();
		Animal aa = new Dog();
		aa.run();
		Animal aaa = new Animal();
		//Dog dd = (Dog)aaa;class cast ex
		//dd.run();
	}
}
