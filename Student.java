import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		String sname;
		int sage;
		float stotalmark;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student Name");
		sname=s.nextLine();
		System.out.println("Enter the Student age");
		sage=s.nextInt();
		System.out.println("Enter the Student total mark");
		stotalmark=s.nextFloat();
		System.out.println("Student Name "+sname);
		System.out.println("Student age "+sage);
		System.out.println("Student Total Mark "+stotalmark);
	}

}
