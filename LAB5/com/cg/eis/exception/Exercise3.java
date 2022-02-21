package com.cg.eis.exception;
import java.util.*;

class Exercise3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary :");
		double sal = sc.nextDouble();
		
		try
		{
			SalaryValidation(sal);
		}
		catch(EmployeeException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}
	
	static void SalaryValidation(double sal) throws EmployeeException
	{
		if(sal < 3000)
		{
			throw new EmployeeException("Sorry , you salary is less than 3000");
		}
		else
		{
			System.out.println("Salary is "+sal);
		}
	}
}

class EmployeeException extends Exception
{
	EmployeeException(String string)
	{
		super(string);
	}
}