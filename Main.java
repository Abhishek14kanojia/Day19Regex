package com.day19Regex;

import java.util.Scanner;

public class Main  extends Details{
	
	

	static Scanner sc = new Scanner(System.in);
	static String firstname;
	static String lastname;
	static String email;
	
	public static void main(String[] args) {
		System.out.println("welcome to the user registration problem");
		userFirstname();
		userLastname();
		userEmail();
	}

	public static void userFirstname() {
		System.out.println("Enter the first Name : ");
		firstname = sc.next();
		Details.validFirstName(firstname);
	}
	public static void userLastname() {
		System.out.println("Enter the last Name : ");
		lastname = sc.next();
		Details.vaildLastName(lastname);
	}
	public static void userEmail() {
		System.out.println("Enter the your Email : ");
		email = sc.next();
		Details.validEmain(email);
	}
	
}
