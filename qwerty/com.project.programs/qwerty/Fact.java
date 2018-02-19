package qwerty;

import java.util.Scanner;

import com.project.utility.utility;

public class Fact {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
System.out.print("enter a number");
int n=s.nextInt();
utility ut=new utility();
System.out.println("factorial of a number is"+ut.fact(n));

	}

}
