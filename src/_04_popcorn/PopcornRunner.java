package _04_popcorn;
import java.util.Scanner;

public class PopcornRunner {
	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		
		Scanner flavor = new Scanner(System.in);
		System.out.print("Popcorn Flavor: ");
		String s = flavor.next();
		flavor.close();
		/*
		Scanner time = new Scanner(System.in);
		System.out.print("Set time: ");
		int i = time.next();
		time.close();
		*/
		Popcorn popcorn = new Popcorn(s);
		microwave.putInMicrowave(popcorn);
		//microwave.setTime(i);
		microwave.startMicrowave();
		
	}
}
