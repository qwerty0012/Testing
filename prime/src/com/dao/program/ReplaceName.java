package com.dao.program;

import java.util.Scanner;

public class ReplaceName {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str="hello user,this is mumbai city";
		System.out.println(str);
		System.out.println("enter word you have to replace");
		String str1=s.next();
		System.out.println("enter username you want to replace");
		String str2=s.next();
		if(str.length()>5) {
			String ss = str.replace(str1, str2);
		System.out.println(ss);
		
		}
	}

}
