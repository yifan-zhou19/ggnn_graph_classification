package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????3?5?7????  **
	//*?????? 1300012965 **
	//*???2013.10.3  **
	//********************************
	public static int Main()
	{
		int n; //??????
		int a;
		int b;
		int c;

		char d;

		a = 3;

		b = 5;

		c = 7;

		d = ' '; //????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (n % a == 0 && n % b == 0 && n % c == 0)
		{

			System.out.print(a);
			System.out.print(d);
			System.out.print(b);
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}

		if (n % a == 0 && n % b == 0 && n % c != 0)
		{

			System.out.print(a);
			System.out.print(d);
			System.out.print(b);
			System.out.print("\n");
		}

		if (n % a == 0 && n % b != 0 && n % c == 0)
		{

			System.out.print(a);
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}

		if (n % a != 0 && n % b == 0 && n % c == 0)
		{

			System.out.print(b);
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}

		 if (n % a != 0 && n % b != 0 && n % c == 0)
		 {

			 System.out.print(c);
			 System.out.print("\n");
		 }

		  if (n % a != 0 && n % b == 0 && n % c != 0)
		  {

			  System.out.print(b);
			  System.out.print("\n");
		  }

		  if (n % a == 0 && n % b != 0 && n % c != 0)
		  {

			  System.out.print(a);
			  System.out.print("\n");
		  }

		  if (n % a != 0 && n % b != 0 && n % c != 0)
		  {

			System.out.print("n");
			System.out.print("\n");
		  }

		return 0;

	}

}

