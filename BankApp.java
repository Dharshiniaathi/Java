package com.edu.wed;

import java.util.Scanner;

class Bank{
	float amount;
	void deposit(float depositamount) {
		amount=amount+depositamount;
		System.out.println("Balance in the Bank after deposit"+amount);
	}
	void withdraw(float withdrawamount) {
		if(withdrawamount>amount) {
			System.out.println("Insufficient Balance.....!");
			System.out.println("Available Balance= "+amount);
		}else {
		amount=amount-withdrawamount;
		System.out.println("Available Balance= "+amount);
	}
}
}
public class BankApp {

	public static void main(String[] args) {
		float damount, wamount;
		int choice;
		Bank ob=new Bank();
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("*******MENU*******");
			System.out.println("1. To Deposit");
			System.out.println("2. To Withdraw");
			System.out.println("Enter your Choice");
			choice=s.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the amount to deposit");
			damount=s.nextFloat();
			ob.deposit(damount);
			break;
			case 2:System.out.println("Enter the amount to be withdraw");
			wamount=s.nextFloat();
			ob.withdraw(wamount);
			break;
			default:System.out.println("invalid Input");
			break;
			}
			System.out.println("Do you want to continue (Y/N)");
			char option=s.next().charAt(0);
			if(option=='n')
				break;
			}
		System.out.println("******EXIT******");	
		}
		
	}

	
	

