package _05_vault;

public class Runner {
	public static void main(String args[]) {
		vault v = new vault(-74534);
		Bond b = new Bond();
		int num = b.findCode(v);
		System.out.print(num);
	}
	
}