package _05_vault;

public class vault {
	int secretCode;
	
	vault(int secretCode){
		this.secretCode = secretCode;
		
	}
	
	boolean tryCode(int code) {
		if (code == secretCode) {
			return true;
		} else {
			return false;
		}
			
	}
	
}