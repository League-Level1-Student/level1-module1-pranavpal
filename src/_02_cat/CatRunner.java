package _02_cat;


public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("Whiskers");
		cat.meow();
		cat.printName();
		
		int lives = 9;
		while (lives > 0) {
			cat.kill();
			lives--;
		}
	}
}