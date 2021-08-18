
public class Supervisior extends ILeaveRequestHandler {

	
	public Supervisior(int days) {
		this.days=days;
	}
	@Override
	protected void approve(String name) {
		System.out.println(name+" Leave accepted by Supervisior");

	}

	@Override
	protected void reject(String name) {
		System.out.println(name+" Leave rejected by Supervisior");

	}

}
