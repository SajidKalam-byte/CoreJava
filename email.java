import java.util.Scanner;

class mail
{
	void emailAddressValidator(String e)
	{
		int l =  e.length();
		int a =e.indexOf('@');
		int d =e.indexOf('.');
		int ad = e.lastIndexOf('@');
		int dd = e.lastIndexOf('.');
		int sp = e.indexOf(' ');
		if (sp <= 0 && ad == a && a > 0 && d==dd && d > a && d< l -2)
		{	
			System.out.println("Valid Email Address");
		}
		else
		{
			System.out.println("InValid Email Address");

		}
	
	}
}

class email
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("\nEnter email");
			String s = sc.nextLine();
			System.out.flush();
			mail obj = new mail();
			obj.emailAddressValidator(s);
		}
	}


}
