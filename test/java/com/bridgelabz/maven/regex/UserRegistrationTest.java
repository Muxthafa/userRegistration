package com.bridgelabz.maven.regex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

/**
 * Unit test for simple UserRegistration.
 */


public class UserRegistrationTest {
	Scanner sc = new Scanner(System.in);
	
	@Test
	public void firstNameTest() {
		UserRegistration validation = new UserRegistration();
		boolean result;
		System.out.println("Enter the first name");
		String firstName = sc.next();
		try {
			result = validation.checkFirstname(firstName);
			Assert.assertEquals(true, result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void lastNameTest() {
		UserRegistration validation = new UserRegistration();
		boolean result;
		System.out.println("Enter the last name");
		String lastName = sc.next();
		try {
			result = validation.checkLastname(lastName);
			Assert.assertEquals(true, result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void emailTest() {
		UserRegistration validation = new UserRegistration();
		boolean result;
		System.out.println("Enter the email");
		String email = sc.next();
		try {
			result = validation.checkEmail(email);
			Assert.assertEquals(true, result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void numberTest() {
		UserRegistration validation = new UserRegistration();
		boolean result;
		System.out.println("Enter the phone number");
		String number = sc.next();
		try {
			result = validation.checkPhone(number);
			Assert.assertEquals(true, result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void passwordTest() {
		UserRegistration validation = new UserRegistration();
		boolean result;
		System.out.println("Enter the password");
		String password = sc.next();
		try {
			result = validation.checkPassword(password);
			Assert.assertEquals(true, result);
		}catch(UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}
}
