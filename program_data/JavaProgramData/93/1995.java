package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0)
		{
			System.out.print("3 5 7");
		}
		else if (n % 3 == 0 && n % 5 == 0)
		{
			System.out.print("3 5");
		}
		else if (n % 3 == 0 && n % 7 == 0)
		{
			System.out.print("3 7");
		}
		else if (n % 5 == 0 && n % 7 == 0)
		{
			System.out.print("5 7");
		}
		else if (n % 5 == 0)
		{
			System.out.print("5");
		}
		else if (n % 7 == 0)
		{
			System.out.print("7");
		}
		else if (n % 3 == 0)
		{
			System.out.print("3");
		}
		else
		{
			for (i = 2;i <= n - 1;i++)
			{
				if (n % i == 0)
				{
					a = 0;
				}
			}
			if (a == 1)
			{
				System.out.print("n");
			}
		}
	}

}

