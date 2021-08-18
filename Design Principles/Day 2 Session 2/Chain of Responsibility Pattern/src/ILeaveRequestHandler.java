
public abstract class ILeaveRequestHandler {
    
	public static int SUPERVISORDAYS=3;
	public static int PROJECTMANAGER=5;
	public static int HRDAYS=7;
	
	protected ILeaveRequestHandler nextHandler;
	protected int days;
	
	public void setNextHandler(ILeaveRequestHandler handler) {
		this.nextHandler=handler;
	}
	public void HandleRequest(int days,String name) {
		if(days>this.days) {
			reject(name);
		}
		else {
			approve(name);
		}
		if(nextHandler!=null) {
			nextHandler.HandleRequest(days, name);
		}
		
	}
	
	 protected abstract void approve(String name);
	 protected abstract void reject(String name);
	
	
	
	
	
	
}
