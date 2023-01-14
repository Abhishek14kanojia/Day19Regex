package com.day19Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Details {

	public static void ValidFirstName(String firstnsme) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(firstnsme);
		
		if(mc.matches()) {
			System.out.println("Vaild");
		}else {
			System.out.println("Invalid");
		}
		
		
		
		
	}
	
}
