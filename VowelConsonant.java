import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		char c;
		Scanner n1=new Scanner(System.in);
		System.out.println("Enter the Character");
		c=n1.next().charAt(0);
		if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u' || c=='A' || c=='E' || c=='I'|| c=='O'|| c=='U')
		{
			System.out.println("vowel");
		}
		
		else
		{
			System.out.println("consonents");
		}
	}
}