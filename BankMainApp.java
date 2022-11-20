class BankBalance extends Exception{
public BankBalance(String s) {
	super(s);
}
}
class Bank{
	float amount;
	public Bank() {
		amount=10000;
	}
	void withdraw(float wamount) {
		try {
			if(wamount>amount) {
			throw new BankBalance("Insufficient Balance...! cannot withdraw");
		}else {
			amount=amount-wamount;
			System.out.println("Bank Balance= "+amount);		
			}
	}
		catch(BankBalance e) {
			e.printStackTrace();
		}
}
}
public class BankMainApp {

	public static void main(String[] args) {
	Bank ob=new Bank();
	ob.withdraw(12000);
	}

}

