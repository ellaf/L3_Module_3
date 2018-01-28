
public abstract class Animal {
	protected String food;
	
	public Animal(String food) {
		this.food = food;
		
	}
	
	public String whatFood() {
		return food;
		
	}
	
	abstract String makeNoise();

}
