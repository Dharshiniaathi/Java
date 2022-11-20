import java.util.Scanner;

class PositiveNegativeCheck{
	int num;
	void inputData() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=s.nextInt();
		}
	void CheckNum() {
		if(num>0) {
			System.out.println(num+" is positive");
		}
		else {
			System.out.println(num+" is Negative");
		}
	}
}

public class SampleIfElse {
	public static void main(String[] args) {
		PositiveNegativeCheck ob=new PositiveNegativeCheck();
		ob.inputData();
		ob.CheckNum();
	}

}
