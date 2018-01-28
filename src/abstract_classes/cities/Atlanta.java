package abstract_classes.cities;

public class Atlanta extends City{
	
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		
	return (population*growthRate) * (growthRate*2);
	}

}
