import java.util.Random;
//impoer java.util.Scanner;

class Person
{
  private String name;
  private double age;
  
  public String getName()
  {
  return name;
  }
  
  public void setName(String name)
  {
   this.name = name;
  }
  
  public double getAge()
  {
  return age;
  }
  
  public void setAge(double age)
  {
   this.age = age;
  }
}


class Account 
{
  private long accNum;
  private double balance;
  private Person accHolder;

  public long getAccNum()
  {
  return accNum;
  }
  
  public void setAccNum(int accNum)
  {
   this.accNum = accNum;
  }
  
  public double getBalance()
  {
  return balance;
  }
  
  public void setBalance(double balance)
  {
   this.balance = balance;
  }

  public Person getAccHolder()
  {
  return accHolder;
  }
  
  public void setAccHolder(Person accHolder)
  {
   this.accHolder = accHolder;
  }


  public void deposit(double addmoney)
  {
   balance = balance + addmoney;
  }

   public void withdraw(double drawmoney)
  {
   balance = balance - drawmoney;
  }

}


class SavingsAccount extends Account
{
   final int minbal = 500;
   public void withdraw(double drawmoney)
   {
   
   if(getBalance() >= minbal+drawmoney)
   {
   double d1 = getBalance() - drawmoney;
   setBalance(d1);
   System.out.println("Balance :"+d1);
   }
   else
   { 
    System.out.println("Minimum balance required");
   }
 
   }

}



class CurrentAccount extends Account
{
   int limit = 500;
   public void withdraw(double drawmoney)
   {
  
   if(getBalance() >=limit+drawmoney)
   {
   double d2 = getBalance() - drawmoney;
   setBalance(d2);
   System.out.println("Balance :"+d2);
   }
   else
   { 
   System.out.println("Minimum balance required");  
   }
 
   }

}

class Main
{

  public static void main(String[] args)
  {
 
	Person p1= new Person();
	p.setName("Smith");
	p.setAge(25);
	
	Account a1=new Account();
	a1.setBalance(2000);
	a1.setAccNum(06234);
	a1.

	Person p2= new Person();
	p.setName("Kathy");
	p.setAge(26);

	Account a2=new Account();
	a2.setBalance(3000);
	a2.setAccNum(06235)
}
}
