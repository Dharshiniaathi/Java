package com.edu.wed;

import java.util.Scanner;

public class FormulaUsingInfiniteLoop {

	public static void main(String[] args) {
		int choice;
		float l, b, bs, h, a, area;
		double pi, r, result;
		pi=3.14;
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.println("*****MENU*****");
		System.out.println("1. Area of Square ");
		System.out.println("2. Area of Rectangle");
		System.out.println("3. Area of Triangle");
		System.out.println("4. Area of Circle");
		System.out.println("Enter your Choice");
		choice=s.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter the Value");
		a=s.nextFloat();
		area=a*a;
		System.out.println("Area of Square= "+area);
		break;
		case 2: System.out.println("Enter the Values");
		l=s.nextFloat();
		b=s.nextFloat();
		area=l*b;
		System.out.println("Area of Rectangle= "+area);
		break;
		
		case 3: System.out.println("Enter the Values");
		b=s.nextFloat();
		h=s.nextFloat();
		area=(b*h)/2;
		System.out.println("Area of Triangle= "+area);
		break;
		
		case 4: System.out.println("Enter the values");
		r=s.nextDouble();
		result=pi*r*r;
		System.out.println("Area of Circle= "+result);
		break;
		
		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println("Do you want to repeat the calculaion y/n");
		char ch=s.next().charAt(0);
		if(ch=='n')
			break;
		}	
		System.out.println("The Program is terminated");
	}

}
