class Exercise2
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(null,"JAY",null);
		//Employee e1 = new Employee("Monkey","D","Luffy");

		try
		{
			Employee.validateName(e1.firstName, e1.middleName, e1.lastName);
		}
		catch(InvalidNameException  e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}
}

class Employee
{
	String firstName;
	String middleName;
	String lastName;

	Employee(String firstName,String middleName,String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
		
	static void validateName(String firstName,String middleName,String lastName) throws InvalidNameException
	{
		if(firstName == null && lastName == null)
		{
			throw new InvalidNameException("Name  is not valid");
		}
		else
		{
			System.out.println("Name is valid");
		}
	}
}

class InvalidNameException extends Exception
{
	InvalidNameException(String string)
	{
		super(string); // https://youtu.be/KFoN6hQ3yAs?list=PLsyeobzWxl7pFZoGT1NbZJpywedeyzyaf&t=205
	}
}
