
public class MultipleTryCatch {

	public static void main(String[] args) {
		int a=15,b=3,c=0;
		int ar[]= {3,8,4,6,7};
		try {
			c=a/b;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			}
		try {
			ar[6]=43;
		}
		catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();	
		}
		finally{
			System.out.println("Finally Block will always execute");
		}

	}

}
