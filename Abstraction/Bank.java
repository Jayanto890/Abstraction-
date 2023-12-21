package Abstraction;

import java.util.Scanner;

public abstract class Bank 
{
public String Name ="My Bank";
public String IFSC ="My Bank";

public void bankDetail()
{
	System.out.println(" Bank_Name: "+Name+" "+"Bank_IFSC code : "+IFSC);
	
}
abstract void Deposite();
abstract void Withdraw();
abstract void CheckBal();

}
class bank_service extends Bank 
{
	private double bal=5000;
	private int pwd;
	private double money;
	

	void Deposite() 
	{
	System.out.println(" Enter Password:");
	Scanner s = new Scanner(System.in);
	pwd=s.nextInt();
	
	if(pwd==123)
	{
		System.out.println("Enter the Amount :");
		money=s.nextDouble();
		bal=bal+money;
		System.out.println("Deposite Money: "+money);
		System.out.println("Total Balance: "+bal);
	}
	else
	{
		System.out.println("Incorrect Password....");
	 }
}
	
	
	void Withdraw() 
	{
		System.out.println("Enetr Widhrawl Amount:");
		Scanner s = new Scanner (System.in);
		pwd=s.nextInt();
		if(pwd==123) 
		{
			money=s.nextDouble();
			bal= bal-money;
			System.out.println("Widhrawl Money "+money);
			System.out.println("Total Balance"+bal);
			
		}
		else
		{
			System.out.println("Incorrect Password....");
		}
		
	}
	void CheckBal() 
	{
		
		System.out.println("Enetr the Password :");
		Scanner s = new Scanner(System.in);
		 pwd=s.nextInt();
		
		if(pwd==123) 
		{
			System.out.println("Total Balance :"+bal);
		}
		else
		{
			System.out.println("Incorrect Password....");
		}
	}
	
}

class Customer
{
	public static void main(String []srgs)
	{
		bank_service b= new bank_service();
		b.bankDetail();
		
		
		int ch;
		System.out.println("1. Deposite");
		System.out.println("2. Withdrawl");
		System.out.println("3. Check Balance");
		
		System.out.println("Enter your choice ");
		Scanner s2 = new Scanner(System.in);
		ch= s2.nextInt();
		
		switch(ch) 
		{
		case 1: b. Deposite();
		break;
		
		case 2: b. Withdraw();
		break;
		
		
		case 3: b. CheckBal();
		break;
		default : System.out.println("Invalid choice");
		
		}
	}
}
