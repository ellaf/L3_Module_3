package abstract_classes.farm;

public class Alpaca extends Animal{

	public Alpaca(String food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	String makeNoise() {
		String sound = "humm";
		return sound;
	}

}
