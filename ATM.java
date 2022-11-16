package com.edu.atm;

import java.util.Scanner;

class Bank{
	float amount;
	//to deposit money
	void deposit(float depositamount) {
		amount=amount+depositamount;
		System.out.println("Your money has been DEPOSITED SUCCESSFULLY");
		System.out.println("Balance in your account after deposit: "+amount);
	}
	//to withdraw money
	void withdraw(float withdrawamount) {
		if(withdrawamount>amount) {
			System.out.println("Insufficient Balance.....! can't withdraw");
			System.out.println("Available Balance: "+amount);
		}else {
		amount=amount-withdrawamount;
		System.out.println("Please collect your cash");
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
		int pinno;
		int choice;
		Bank ob=new Bank();
		Scanner s=new Scanner(System.in);	
		while(true) {
			System.out.println("****WELCOME TO IDFC ATM****");
			System.out.println("Enter Pin Number");
			pinno=s.nextInt();
			if(pinno==1410) {
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
			}else {
				System.out.println("Please enter the valid Pin no");
			}
			// for repeat the process
			System.out.println("Do you want to continue (Y/N)");
			char option=s.next().charAt(0);
			if(option=='n')
				break;
		}
		
		

	}

}
