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
	 * @param lastname
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
	
	/**
	 * @method email checks if email matches pattern
	 * @param email
	 * @return boolean
	 */
	public boolean checkEmail(String email) {
		String email_pattern="^[a-zA-Z0-9-_]+([.]?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+[.][a-zA-Z]{1,4}([.]?[a-zA-Z-_]+)";
		if(Pattern.matches(email_pattern, email)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * @method checkPhone checks if phone number matches pattern
	 * @param number
	 * @return boolean
	 */
	public boolean checkPhone(String number) {
		String number_pattern="^([+][0-9]{2,3})[ ][0-9]{10}";
		if(Pattern.matches(number_pattern, number)) {
			return true;
		}else {
			return false;
		}
	}
}
