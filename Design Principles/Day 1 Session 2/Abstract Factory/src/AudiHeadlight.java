
public class AudiHeadlight extends Headlight {

	private String name;
	
	public AudiHeadlight() {
		name="You selected Audi Headlight";
	}
	
	@Override
	String getHeadlightName() {
		return name;
	}

}
