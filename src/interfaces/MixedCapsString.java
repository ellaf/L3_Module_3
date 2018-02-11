package interfaces;

public class MixedCapsString extends SpecialString{

	
	
	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String funky) {
		String funkyLower = funky.toLowerCase();
		String funkyUpper = funky.toUpperCase();
		char[] funkLow = funkyLower.toCharArray();
		char[] funkUp = funkyUpper.toCharArray();
		String newFunky = "";
		for (int i = 0; i < funky.length(); i+= 1) {

			if(i%2 == 0) {
			newFunky += funkyLower.charAt(i);
			}else {
			newFunky += funkyUpper.charAt(i);	
			}
			
		}
	
		return newFunky;
	}


	
	
}
