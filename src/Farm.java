import java.util.ArrayList;

import abstract_classes.cities.City;

public class Farm {

	
	public static void main(String[] args) {
		
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Animal cow = new Cow("alfalfa");
		Animal sheep = new Sheep("forbs");
		Animal alpaca = new Alpaca("hay");
		Animal pig = new Pig("vegetables");
		
		farm.add(cow);
		farm.add(sheep);
		farm.add(alpaca);
		farm.add(pig);
		farm.add(pig);
		farm.add(alpaca);
		for (int i = 0; i < farm.size(); i++) {
			
		System.out.println(farm.get(i).makeNoise());
		System.out.println(farm.get(i).whatFood());
			
		}
	}
	
}
