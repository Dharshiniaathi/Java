
public class MultipleCatch {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]= {5,6,2,1,0};
		try {
			c=a/b;
			System.out.println("After Division= "+c);
			ar[6]=34;
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e ) {
			e.printStackTrace();
		}//catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
		//}//catch(Exception e) {
			//e.printStackTrace();
		//}
finally {
			System.out.println("Finally Block executes always");
		}
	}
}	
	