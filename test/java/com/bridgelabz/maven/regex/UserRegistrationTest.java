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
    	String input1=sc.nextLine();
    	
    	System.out.println("Enter Last Name:");
    	String input2=sc.nextLine();
    	
    	assertEquals(true,registration.checkFirstname(input1));
        assertEquals(true,registration.checkLastname(input2));
    }
}
