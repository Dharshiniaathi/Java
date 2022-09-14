import java.util.Scanner;
public class UserInputData {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		float f;
		byte b;
		short s;
		char ch;
		String fname;
		System.out.println("Enter name");
		fname=sc.next();
		System.out.println("Enter the Integer value ");
		i=sc.nextInt();
		System.out .println("Enter the float value  ");
		f=sc.nextFloat();
		System.out.println("Enter the Byte Value");
		b=sc.nextByte();
		System.out.println("Enter the Short Value");
		s=sc.nextShort();
		System.out.println("Enter any Character");
		ch=sc.next().charAt(0);
		
		//then display all the values
		System.out.println("Name "+fname);
		System.out.println("Integer "+i);
		System.out.println("Float "+f);
		System.out.println("Byte "+b);
		System.out.println("Short "+s);
		System.out.println("Character "+ch);
	}

}
