package interfaces;

import java.util.ArrayList;

import abstract_classes.farm.Animal;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String funky) {

		char[] funk = funky.toCharArray();
		String newFunky = "";
		for (int i = funk.length-1; i > -1; i--) {
				
			newFunky += funk[i];
			//System.out.println(newFunky);
				
			}	
		
		return newFunky;
			
		}
		
		

	
	
	 
}
