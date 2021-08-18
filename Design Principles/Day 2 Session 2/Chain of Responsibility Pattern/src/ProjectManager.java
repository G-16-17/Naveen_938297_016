
public class ProjectManager extends ILeaveRequestHandler {

	public ProjectManager(int days) {
		this.days=days;
	}
	
	@Override
	protected void approve(String name) {
		System.out.println(name+" Leave accepted by Project Manager");

	}

	@Override
	protected void reject(String name) {
		System.out.println(name+" Leave rejected by Project Manager");

	}

}
