package abstract_classes.cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	double getAnnualTaxes() {

	double taxes = (population * growthRate) + 1000000;
		
		return taxes;
	}

}
