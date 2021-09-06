package com.bridgelabz.maven.regex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

/**
 * Unit test for simple UserRegistration.
 */
public class UserRegistrationTest 
{
    @Test
    public void patternTest()
    {
    	UserRegistration registration = new UserRegistration();
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter First Name:");
    	String firstname=sc.nextLine();
    	
    	System.out.println("Enter Last Name:");
    	String lastname=sc.nextLine();
    	
    	System.out.println("Enter email:");
    	String email=sc.nextLine();
    	
    	System.out.println("Enter phone number:");
    	String phone_number=sc.nextLine();
    	assertEquals(true,registration.checkFirstname(firstname));
        assertEquals(true,registration.checkLastname(lastname));
        assertEquals(true,registration.checkEmail(email));
        assertEquals(true,registration.checkPhone(phone_number));
    }
}
