import java.util.Scanner;
class BankAccount
{
	int accountNumber;
	double balance;
	BankAccount(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;	
	}

	void withdraw(double amount)
	{
		if ( balance < amount)
		{
			System.out.println("XXXXXXXXXXXXX Insufficient Balance  XXXXXXXX");
		}
		else
		{
			balance = balance - amount;
			System.out.println("Withdraw : "+ amount+"\n");


		}
	}

	void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Deposited :"+amount+"\n");
	}
	void check()
	{
		System.out.println("Account no: "+ accountNumber +"\nBalance : "+ balance+"\n");
	}

}


public class BankManage{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount obj = new BankAccount(54786552, 0.00);
		while(true)
		{	
			System.out.println("\n"+"Enter choice \n1.DEPOSIT:\n2.WITHDRAW:\n3.BALANCE CHECK:\n4.EXIT"+"\n"+"\n");
			int choice = sc.nextInt();
			 if ( choice == 1)
			{	
				int bal;
				System.out.println("Enter Amt to deposit : ");
				bal = sc.nextInt();
				obj.deposit(bal);

			}
			else if ( choice == 2)
			{
				int with;
				System.out.println("Enter to withdraw : ");
				with = sc.nextInt();
				obj.withdraw(with);

			}
			else if ( choice == 3)
			{
				obj.check();
			}
			else if ( choice == 4)
			{
				break;
			}
			else
			{
				System.out.println("XXXXXX ENTER CORRECT CHOICE XXXXXXXX");
			}
		}


    }
}