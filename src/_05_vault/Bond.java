package _05_vault;

public class Bond {
	int findCode(vault v) {
		int i;
		for (i = 0; i < 1000001; i++) {
			
			if (v.tryCode(i)) {
				return i;
			} 
		}
		return -1;	
	}
	
}