class EmployeeException extends Exception{
	public EmployeeException(String s) {
		super(s);
	}
}
class EmployeeID{
	public void CheckId(int EmpID) {
		try {
			if(EmpID<=0 || EmpID>=999) {
				throw new EmployeeException("Invalid Employee ID");
			}else
			{
			System.out.println("Valid Employee");	
			}
	}catch(EmployeeException e) {
	e.printStackTrace();	
	}
}
}
public class EmpIDMain {
  public static void main(String[] args) throws EmployeeException {
	  EmployeeID ob=new EmployeeID();
	  ob.CheckId(0);
}
}
