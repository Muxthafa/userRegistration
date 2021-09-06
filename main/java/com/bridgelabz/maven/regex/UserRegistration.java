package com.bridgelabz.maven.regex;

import java.util.regex.Pattern;

/**
 * class UserRegistration contains functions
 * to validate user details using regex
 * @author mohammad.musthafa_ym
 */
public class UserRegistration 
{
	/**
	 * @method checkFirstname checks if first name matches pattern
	 * @param firstname
	 * @return boolean
	 */
	public boolean checkFirstname(String firstname) {
		String firstname_pattern="^[A-Z]{1}[a-zA-Z]{3,}";
		if(Pattern.matches(firstname_pattern, firstname)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * @method checkLastname checks if last name matches pattern
	 * @param firstname
	 * @return boolean
	 */
	public boolean checkLastname(String lastname) {
		String lastname_pattern="^[A-Z]{1}[a-zA-Z]{3,}";
		if(Pattern.matches(lastname_pattern, lastname)) {
			return true;
		}else {
			return false;
		}
	}
}
