package com.eval3;

import java.util.Scanner;

public abstract class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId,String employeeName)
	{
		this.employeeId = employeeId;
		this.employeeName=employeeName;
	}
	
	abstract void calculateSalary();
	
}

class PermanentEmployee extends Employee{

	private double basicpay;
	
	public double getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}

	double PF_Amount = this.basicpay * 0.12;
	
	@Override
	void calculateSalary() {
		double salary = this.basicpay - this.PF_Amount;
		
	}
	
}

class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;

	@Override
	void calculateSalary() {
		
		int salary = hoursWorked*hourlyWages;
		
	}
	
	public TemporaryEmployee() {
		// TODO Auto-generated constructor stub
	}
	public TemporaryEmployee(int employeeId,String employeeName,int hoursWorked, int hourlyWages) {
		
		this.employeeId=employeeId;
		this.employeeName = employeeName;
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
		
	}
	
}

class Loan extends Employee{
	private Loan() {
		
	}
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj.equals(TemporaryEmployee))
		{
		double loanAmount = (20/100) *employeeObj.salary;
		return loanAmount;
		}
		else if(employeeObj.equals(PermanentEmployee))
		{
		double loanAmount = (15/100) *employeeObj.salary;
		return loanAmount;
		}
		
		return 0.0;
	}
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
	}
}

class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter EmployeeId: ");
		int employeeId = scanner.nextInt();
		System.out.println("Enter EmployeeName: ");
		String employeeNameString = scanner.next();
		System.out.println("Enter Basic pay: ");
		double basicpay = scanner.nextDouble();
		System.out.println("Enter Hours Worked: ");
		int hoursWorked = scanner.nextInt();
		System.out.println("Enter Hourly Wages: ");
		int hourly = scanner.nextInt();
		
		PermanentEmployee permanentEmployee = new PermanentEmployee();
		permanentEmployee.setBasicpay(basicpay);
		
		TemporaryEmployee temporaryEmployee = new TemporaryEmployee(employeeId,employeeNameString,hoursWorked,hourly);
		
		
		
	}
}





//hoursWorked: Integer
//hourlyWages: Integer

//employeeId: Integer
//employeeName: String
//salary: double