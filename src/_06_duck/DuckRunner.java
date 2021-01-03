package _06_duck;

public class DuckRunner {
	public static void main(String args[]) {
		Duck daffy = new Duck("donuts",5);
		daffy.quack(); 
		daffy.waddle();
	
		Platypus perry = new Platypus("cake", 1);
		perry.growl();
		perry.waddle();
	}
	
}

