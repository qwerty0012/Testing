package com.dao.program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		if(n%4==0)
			System.out.println("enter year is a leap year");
		else
		
        System.out.println("not a leap year");
	}

}
