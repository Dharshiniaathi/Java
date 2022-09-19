import java.util.Scanner;
class ComparingNumbers{
	int i;
	void InputData() {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the Number");
		i=S.nextInt();
	}
	void CheckData() {
		if(i==10) {
			System.out.println("Number is "+i);
		}
		else if(i==20) {
			System.out.println("Number is "+i);
		}
		else if(i==30) {
			System.out.println("Number is "+i);
		}
		else if(i==40) {
			System.out.println("Number is "+i);
		}
		else{
			System.out.println("The Given number is not Equal to 10/20/30/40");
		}
		
	}
	
}

public class CheckNum {

	public static void main(String[] args) {
		ComparingNumbers ob=new ComparingNumbers();
		ob.InputData();
		ob.CheckData();
		}
}
