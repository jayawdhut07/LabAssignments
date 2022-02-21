package com.cg.eis.main;
import com.cg.eis.exception.EmployeeException;
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
			validateSalary(sal);
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}
	
	static void validateSalary(double sal) throws EmployeeException
	{
		if(sal < 3000)
		{
			throw new EmployeeException("salary cannot be less than 3000");
		}
		else
		{
			System.out.println("Salary is "+sal);
		}
	}
}

