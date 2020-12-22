package _05_vault;

public class Bond {
	int findCode(int secretCode) {
		int i;
		for (i = 0; i < 1000001; i++) {
			if (i == secretCode) {
				return i;
			}
		}
		return 0;	
	}
	
}