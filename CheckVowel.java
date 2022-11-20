import java.util.Scanner;

class Checking{
	char c;
	void InputData() {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the Character");
		c=S.next().charAt(0);
	}
	void CheckData() {
		if(c=='A' || c=='a') {
			System.out.println(c+"Its a vowel");
		}
		else if(c=='E' || c=='e') {
			System.out.println(c+"Its a Vowel ");
		}
		else if(c=='I'|| c=='i') {
			System.out.println(c+"Its a Vowel");
		}
		else if(c=='O' || c=='o') {
			System.out.println(c+"Its a Vowel");
		}
		else if(c=='U' || c=='u') {
			System.out.println(c+"Its a Vowel ");
		}
		else{
			System.out.println("The Character is consonant");
		}
	}
}
public class CheckVowel {
	public static void main(String[] args) {
		Checking ob=new Checking();
		ob.InputData();
		ob.CheckData();
	}

}
