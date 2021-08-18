
public class Main {

	public static void main(String[] args) {
		
		BugattiVeyron movable=new BugattiVeyron();
		MovableAdapterImpl movableAdapterImpl=new MovableAdapterImpl(movable);
		
		System.out.println("Car Speed in US "+movable.getSpeed()+" (MPH)");
		System.out.println("Car Speed in UK "+movableAdapterImpl.getSpeed()+" (KM/H)");
		
	}

}
