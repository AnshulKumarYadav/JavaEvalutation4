package com.eval3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer {
	
	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String username,String password,String mobileNumber,String email)
	{
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email=email;
		
	}
	
	public void display()
	{
		if(Pattern.matches("[a-zA-Z]{3,8}", username)==true && Pattern.matches("[a-zA-Z0-9]{3,8}", password)==true && Pattern.matches("[6789][0-9]{9}", mobileNumber)==true&& Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email)==true){
			System.out.println("The username is: "+username);
			System.out.println("The password is: "+password);
			System.out.println("The mobileNumber is: "+mobileNumber);
			System.out.println("The email is: "+email);
		}
		else {
			System.out.println("Please enter valid details");
//			System.out.println(username);
//			System.out.println(Pattern.matches("[a-zA-Z]{3,8}", username));
//			System.out.println(Pattern.matches("[a-zA-Z0-9]{3,8}", password));
//			System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email));
//			System.out.println(Pattern.matches("[6789][0-9]{9}", mobileNumber));
		}
	}
	
}



class Demo2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = scanner.next();
		System.out.println("Enter password: ");
		String pasString = scanner.next();
		System.out.println("Enter mobileNumber: ");
		String mobileString = scanner.next();
		System.out.println("Enter email: ");
		String emailString = scanner.next();
		
		Customer customer = new Customer(username,pasString,mobileString,emailString);
		
		customer.display();
		
		scanner.close();
		
	}
}





//username: String
//password: String
//mobileNumber: String
//email: String