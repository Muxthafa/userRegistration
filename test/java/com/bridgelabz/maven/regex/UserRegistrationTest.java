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

/**
 * Unit test for simple UserRegistration.
 */

@RunWith(Parameterized.class)
public class UserRegistrationTest 
{
    	String firstName="Mohammad";
    	String lastName="Musthafa";
    	String email;
    	String phone_number="+91 7760219131";
    	String password="Musthafa@26";
    	Boolean expectedResult;
    	UserRegistration user_details;
    	
    	@Before
    	public void initialize()
    	{
    		user_details=new UserRegistration();
    	}
    	
    	public UserRegistrationTest(String email,Boolean expectedResult)
    	{
    		this.email=email;
    		this.expectedResult=expectedResult;
    	}
    	
    	@Parameterized.Parameters
    	public static Collection input()
    	{
    		return Arrays.asList(
    				new Object[][] {
    					{"mxo@gmail.com",true},
    					{"mux-26@gmail.com",true},{"abc.17@yml.com",true},{"mux11@yml.com",true},
    					{"mux-999@abc.net",true},{"mux.111@abc.com.au",true},
    					{"mux@3.com",true},{"mux@gmail.com.com",true},
    					{"abc",false},{"abc@.com.my",false},{"abc123@gmail.a",false},
    					{"abc123@.com",false},{"abc123@.com.com",false},
    					{".mux@abc.com",false},{"mux$3*@gmail.com",false},{"mux@%*.com",false},
    					{"abc.@yahoo.com",false},{"mux@gmail.com.1a",false},{"mux@gmail.com.aa.au",false}
    					});
    	}
    	
    	@Test
        public void patternTest()
        {
    		UserRegistration registration = new UserRegistration();
    		assertEquals(true,registration.checkFirstname(firstName));
    		assertEquals(true,registration.checkLastname(lastName));
    		assertEquals(true,registration.checkEmail(email));
    		assertEquals(true,registration.checkPhone(phone_number));
    		assertEquals(true,registration.checkPassword(password));
        }
}
