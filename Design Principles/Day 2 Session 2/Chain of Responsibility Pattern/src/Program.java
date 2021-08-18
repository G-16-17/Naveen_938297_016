
public class Program {

	private static ILeaveRequestHandler getChanning() {
		
		ILeaveRequestHandler supervisiorHandler=new Supervisior(ILeaveRequestHandler.SUPERVISORDAYS);
		ILeaveRequestHandler hRHandler= new HR(ILeaveRequestHandler.HRDAYS);
		ILeaveRequestHandler projectManagerHandler= new ProjectManager(ILeaveRequestHandler.PROJECTMANAGER);
		
		supervisiorHandler.setNextHandler(projectManagerHandler);
		projectManagerHandler.setNextHandler(hRHandler);
		
		return supervisiorHandler;
	}
	
	
	
	public static void main(String[] args) {
		
		Leaverequest leaveRequest=new Leaverequest();
		leaveRequest.setDays(10);
		leaveRequest.setName("Naveen");
		
		ILeaveRequestHandler handler=getChanning();
		
		handler.HandleRequest(leaveRequest.getDays(), leaveRequest.getName());
	}

}
