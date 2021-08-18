
public class HR extends ILeaveRequestHandler {

	public HR(int days) {
		// TODO Auto-generated constructor stub
		this.days=days;
	}
	
	@Override
	protected void approve(String name) {
		System.out.println(name+" Leave accepted by HR");

	}

	@Override
	protected void reject(String name) {
		System.out.println(name+" Leave rejected by HR");

	}

}
