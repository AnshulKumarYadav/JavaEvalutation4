package com.eval3;

import java.util.Scanner;

public enum Month {
	JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
}

class Demo{
	public void showDetails(Month m)
	{
		switch (m) {
		case JANUARY:System.out.println("This is the 1st Month of the Year January");
		break;
		case FEBRUARY:System.out.println("This is the 2nd Month of the Year February");
		break;
		case MARCH:System.out.println("This is the 3rd Month of the Year March");
		break;
		case APRIL:System.out.println("This is the 4th Month of the Year April");
		break;
		case MAY:System.out.println("This is the 5th Month of the Year May");
		break;
		case JUNE:System.out.println("This is the 6th Month of the Year June");
		break;
		case JULY:System.out.println("This is the 7th Month of the Year July");
		break;
		case AUGUST:System.out.println("This is the 8th Month of the Year August");
		break;
		case SEPTEMBER:System.out.println("This is the 9th Month of the Year September");
		break;
		case OCTOBER:System.out.println("This is the 10th Month of the Year October");
		break;
		case NOVEMBER:System.out.println("This is the 11th Month of the Year November");
		break;
		case DECEMBER:System.out.println("This is the 12th Month of the Year December");
		break;
		default: System.out.println("Invalid Month Name");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		String monthString = sc.next();
		String month = monthString.toUpperCase();
		Demo demo = new Demo();
		try {
		demo.showDetails(Month.valueOf(month));
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}