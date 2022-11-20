import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		int fnum,snum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		fnum=sc.nextInt(); //10
		snum=sc.nextInt(); //13
		if(fnum>snum) {   //10>13  no
			
			System.out.println(fnum +" is larger than "+snum); //19 is lager than 13
		}
		else {
			System.out.println(snum +" is larger than "+fnum);
		}
	}	
}	