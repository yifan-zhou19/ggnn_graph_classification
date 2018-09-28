package <missing>;

public class GlobalMembers
{
	/*??? 1200012866
	2012.10.12
	??3?5?7??*/
	public static int Main()
	{
		int n; //f???????????
		int f = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 105 == 0 && f == 0)
		{
			System.out.print("3 5 7");
			f = 1;
		}
		if (n % 15 == 0 && f == 0)
		{
			System.out.print("3 5");
			f = 1;
		}
		if (n % 21 == 0 && f == 0)
		{
			System.out.print("3 7");
			f = 1;
		}
		if (n % 35 == 0 && f == 0)
		{
			System.out.print("5 7");
			f = 1;
		}
		if (n % 3 == 0 && f == 0)
		{
			System.out.print("3");
			f = 1;
		}
		if (n % 5 == 0 && f == 0)
		{
			System.out.print("5");
			f = 1;
		}
		if (n % 7 == 0 && f == 0)
		{
			System.out.print("7");
			f = 1;
		}
		if (f == 0)
		{
			System.out.print("n");
		}

		return 0;
	}
}

