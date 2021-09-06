package com.bridgelabz.maven.regex;

import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class UserRegistration 
{
	public boolean checkFirstname(String firstname) {
		String firstname_pattern="^[A-Z]{1}[a-zA-Z]{3,}";
		if(Pattern.matches(firstname_pattern, firstname)) {
			return true;
		}else {
			return false;
		}
	}
}
