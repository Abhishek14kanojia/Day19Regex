package com.day19Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Details {

	public static void validFirstName(String firstname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(firstname);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
		
	}
	
	public static void vaildLastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(lastname);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
		
	}
	public static void validEmain(String Email) {
		String regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(Email);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
		
		
	}
	
	public static void validMobileno(String mobileNo) {
		String regex = "^[91][_.][6-9]?[\\d]{9}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(mobileNo);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}	
	}
	public static void vaildPassword(String password) {
		String regex =  "^[a-z A-Z0-9]{8,}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(password);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
		
		
	}
}
