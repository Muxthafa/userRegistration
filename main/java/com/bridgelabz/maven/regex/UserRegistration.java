package com.bridgelabz.maven.regex;

import java.util.regex.Pattern;

/**
 * class UserRegistration contains functions
 * to validate user details using regex
 * @author Mohammad Musthafa
 */
public class UserRegistration 
{
	/**
	 * @method checkFirstname checks if first name matches pattern
	 * @param firstname
	 * @return boolean
	 * @throws UserRegistrationException 
	 */
	public boolean checkFirstname(String firstName) throws UserRegistrationException {
		String firstname_pattern = "^[A-Z]{1}[a-zA-Z]{3,}";
		if (Pattern.matches(firstname_pattern, firstName)) {
			return true;
		} else {
			throw new UserRegistrationException("Enter valid first name");
		}
	}
	
	/**
	 * @method checkLastname checks if last name matches pattern
	 * @param lastname
	 * @return boolean
	 * @throws UserRegistrationException 
	 */
	public boolean checkLastname(String lastName) throws UserRegistrationException {
		String lastname_pattern="^[A-Z]{1}[a-zA-Z]{3,}";
		if(Pattern.matches(lastname_pattern, lastName)) {
			return true;
		}else {
			throw new UserRegistrationException("Enter valid last name");
		}
	}
	
	/**
	 * @method email checks if email matches pattern
	 * @param email
	 * @return boolean
	 * @throws UserRegistrationException 
	 */
	public boolean checkEmail(String email) throws UserRegistrationException {
		String email_pattern="^[a-zA-Z0-9-_]+([.]?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+[.][a-zA-Z]{1,4}([.]?[a-zA-Z-_]+)";
		if(Pattern.matches(email_pattern, email)) {
			return true;
		}else {
			throw new UserRegistrationException("Enter valid email");
		}
	}
	
	/**
	 * @method checkPhone checks if phone number matches pattern
	 * @param number
	 * @return boolean
	 * @throws UserRegistrationException 
	 */
	public boolean checkPhone(String number) throws UserRegistrationException {
		String number_pattern="^([+][0-9]{2,3})?[ ]?[0-9]{10}";
		if(Pattern.matches(number_pattern, number)) {
			return true;
		}else {
			throw new UserRegistrationException("Enter valid number");
		}
	}
	
	/**
	 * @method checkPassword validates password
	 * @param password
	 * @return boolean
	 * @throws UserRegistrationException 
	 */
	public boolean checkPassword(String password) throws UserRegistrationException {
		String password_pattern;
		if(password.length()>7) {
			password_pattern="^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
			return Pattern.matches(password_pattern, password); 
		}else {
			throw new UserRegistrationException("Enter valid password");
		}
	}
}
