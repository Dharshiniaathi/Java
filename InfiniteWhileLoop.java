package com.edu.wed;

import java.util.Scanner;

public class InfiniteWhileLoop {

	public static void main(String[] args) {
	char ch;
	Scanner s=new Scanner(System.in);
	while(true) {
		System.out.println("Inside while loop");
		System.out.println("Do you want while loop to continue (y/n)");
		ch=s.next().charAt(0);
		if(ch=='n') {
			break; //breaks the loop

	}

}
	}
}
