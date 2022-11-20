import java.util.Scanner;

class EvenOdd {
    	  int num;
    	   void inputNum()
			 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();


			}
		void checkEvenOdd() {
			if(num%2==0) {
				System.out.println(num+" even num");
			}
			else {
				System.out.println(num+" even odd");
			}
		}
public class IfElseOddOrEven {

	public static void main(String[] args) {
		EvenOdd eo=new EvenOdd();
		eo.inputNum();
		eo.checkEvenOdd();
			}
	}
}
