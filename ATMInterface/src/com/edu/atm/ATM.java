package com.edu.atm;

import java.util.Scanner;

class Bank{
	float amount;
	//to deposit money
	void deposit(float depositamount) {
		amount=amount+depositamount;
		System.out.println("Balance in the Bank after deposit: "+amount);
	}
	//to withdraw money
	void withdraw(float withdrawamount) {
		if(withdrawamount>amount) {
			System.out.println("Dear User you cannot withdraw the money");
			System.out.println("Insufficient Balance.....!");
			System.out.println("Available Balance: "+amount);
		}else {
		amount=amount-withdrawamount;
		System.out.println("Available Balance: "+amount);
	}
}
	//to check the balance
	void balance() {
		System.out.println("Balance: "+amount);
	}
}
public class ATM {

	public static void main(String[] args) {
		float withdrawAmount,depositAmount;
		int choice;
		int pinno;
		Bank ob=new Bank();
		Scanner s=new Scanner(System.in);	
		while(true) {
			System.out.println("****WELCOME TO IDFC ATM****");
			System.out.println("Enter your Pin No. ");
			pinno=s.nextInt();
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to be withdraw");
				withdrawAmount=s.nextFloat();
				ob.withdraw(withdrawAmount);
				break;
				
			case 2:
				System.out.println("Enter the amount to be deposit");
				depositAmount=s.nextFloat();
				ob.deposit(depositAmount);
				break;
				
			case 3:
				ob.balance();
				break;
				
			case 4:
				System.out.println("Exit....");
				break;
				
			default:
				System.out.println("Invalid");
				
			}
			System.out.println("Do you want to continue (Y/N)");
			char option=s.next().charAt(0);
			if(option=='n')
				break;
		}
		

	}

}
