
public class Main {

	public static void main(String[] args) {
		DBConn instance=DBConn.getInstance();
		if(instance!=null) {
			System.out.println("Instance Created Successfully");
		}
	}

}
