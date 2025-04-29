import java.util.*;
class Customer
{
	private String customerID, name;
	private int cibilScore;
	
	Customer(String customerID, String name, int cibilScore)
	{
		this.customerID = customerID;
		this.name = name;
		this.cibilScore = cibilScore;
	}

	void applyForLoan(double amount)
	{
		if( cibilScore >= 800)
		{
			System.out.println("You are eligible for loan");
			System.out.println("CUstomerID: "+customerID+"\tName: "+name+"\tROI: 8.75%");
		}
		else if( cibilScore >= 750 && cibilScore <= 799)
		{
			System.out.println("You are eligible for loan");
			System.out.println("CUstomerID: "+customerID+"\tName: "+name+"\tROI: 9.15%");
		}
		else if( cibilScore >= 700 && cibilScore <= 749)
		{
			System.out.println("You are eligible for loan");
			System.out.println("CUstomerID: "+customerID+"\tName: "+name+"\tROI: 9.35%");
		}
		else if( cibilScore >= 650 && cibilScore <= 699)
		{
			System.out.println("You are eligible for loan");
			System.out.println("CUstomerID: "+customerID+"\tName: "+name+"\tROI: 9.45%");
		}
		else if( cibilScore >= 550 && cibilScore <= 649)
		{
			System.out.println("You are eligible for loan");
			System.out.println("CUstomerID: "+customerID+"\tName: "+name+"\tROI: 9.75%");
		}
		else if( cibilScore < 550)
		{
			System.out.println("You are not eligible for loan");
		}
		else
		{
			System.out.println("ENTER CORRECT CIBILSCORE");
		}
	}
}

public class CustomerC
{
	public static void main(String arg[])
	{
		String customerid, name;
		int cibilScore;
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customerid: ");
		customerid = sc.nextLine();
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter cibilScore: ");
		cibilScore = sc.nextInt();
		System.out.println("Enter Amount: ");
		amount = sc.nextDouble();
		Customer obj = new Customer(customerid, name, cibilScore);
		obj.applyForLoan(amount);
	}
}