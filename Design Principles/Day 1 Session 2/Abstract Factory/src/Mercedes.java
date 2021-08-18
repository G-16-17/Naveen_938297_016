
public class Mercedes extends Tire {

	private String name;
	
	public Mercedes() {
		name="You selected Mercedes Tire";
	}
	
	@Override
	String getTireName() {
		return name;
	}

}
