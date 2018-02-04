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
		char[] funk = funky.toCharArray();
		char[] funkLow = funkyLower.toCharArray();
		char[] funkUp = funkyUpper.toCharArray();
		String newFunky = "";
		for (int i = 0; i < funk.length; i+= 2) {
			
			newFunky += funkLow[i];
			
			i += 1;
					
			newFunky += funkUp[i];
			System.out.println(newFunky);
		}
		
		return newFunky;
	}


	
	
}
