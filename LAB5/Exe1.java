import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age:");
		
		int age= sc.nextInt();
		
		try {
		aAge(age);
		}
		
		catch (AgeLimitException e) {
			System.out.println("Not Eligible for voting");
		}
	}
	
	static void aAge(int age) throws AgeLimitException
	{
		if(age < 15) {
			throw new AgeLimitException();
			
//			System.out.println("Not Eligible for voting");
		}
		else {
			System.out.println("Eligible for voting");
		}
	}
}

class AgeLimitException extends Exception {
                
}
