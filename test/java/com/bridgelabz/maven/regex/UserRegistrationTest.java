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
    	UserRegistration firstname = new UserRegistration();
    	Scanner sc =new Scanner(System.in);
    	String input=sc.nextLine();
        assertEquals(true,firstname.checkFirstname(input));
    }
}
