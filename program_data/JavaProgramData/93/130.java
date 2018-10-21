package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			System.out.print("3");
			i = 1;
		}
	if (n % 5 == 0)
	{
		if (i == 1)
		{
			System.out.print(" ");

		}
		System.out.print("5");
		j = 1;
	}
	if (n % 7 == 0)
	{
		if (j == 1 || i == 1)
		{
			System.out.print(" ");
		}

		System.out.print("7");
	}
		else if (i == 0 && j == 0)
		{
			System.out.print("n");
		}


		return 0;
	}

}

