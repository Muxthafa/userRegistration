package com.bridgelabz.maven.regex;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistrationLambda {
	
	static Scanner sc=new Scanner(System.in);
	
	
	public static void validationUsingLambda() {

		// validate first name
		System.out.println("First name:");
		String firstName = sc.nextLine();
		Predicate<String> firstnameFilter = Pattern
											.compile("^[A-Z][A-Za-z0-9]{3,}")
											.asPredicate();
		System.out.println(firstnameFilter.test(firstName));

		// validate last name
		System.out.println("Last name:");
		String lastName = sc.nextLine();
		Predicate<String> lastNameTest = Pattern
										.compile("^[A-Z][A-Za-z0-9]{3,}")
										.asPredicate();
		System.out.println(lastNameTest.test(lastName));

		// validate email
		System.out.println("Email:");
		String email = sc.nextLine();
		Predicate<String> emailTest = Pattern
									.compile("^[a-zA-Z0-9-_+]+(\\.?[a-zA-Z0-9-_]+)@[a-zA-Z0-9-_]+\\.[a-zA-Z]{2,}(\\.?[a-zA-Z-_]+)")
									.asPredicate();
		System.out.println(emailTest.test(email));

		// validate mobile
		System.out.println("Mobile number:");
		String mobile = sc.nextLine();
		Predicate<String> phoneTest = Pattern
									.compile("^([0-9]{2}[ ])?[1-9][0-9]{9}$")
									.asPredicate();
		System.out.println(phoneTest.test(mobile));

		// validate password
		System.out.println("Password:");
		String password = sc.nextLine();
		Predicate<String> passwordTest = Pattern
										.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$")
										.asPredicate();
		System.out.println(passwordTest.test(password));
	}

	public static void main(String[] args) {
		validationUsingLambda();
	}
}
