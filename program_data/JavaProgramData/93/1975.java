package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		if (n % 3 == 0)
		{
			System.out.print("3");
		}
		else
		{
			a = 1;
		}
		if (n % 5 + a == 0)
		{
			System.out.print(" 5");
		}
			else if (n % 5 - a == -1)
			{
				System.out.print("5");
			}
			else
			{
				a = a + 1;
			}
		if (n % 7 == 0 && a == 1)
		{
			System.out.print(" 7");
		}
			else if (n % 7 == 0 && a == 0)
			{
				System.out.print(" 7");
			}
			else if (n % 7 == 0 && a == 2)
			{
				System.out.print("7");
			}
		else
		{
			a = 3;
		}
		if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
		{
			a = 1;
		}
		else
		{
			System.out.print("n");
		}
	return 0;

	}
}

