package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
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
			if (i == 0)
			{
				System.out.print("5");
				i = 1;
			}
			else if (i == 1)
			{
				System.out.print(" 5");

			}
		}
		if (n % 7 == 0)
		{
	if (i == 0)
	{
				System.out.print("7");
				i = 1;
	}
			else if (i == 1)
			{
				System.out.print(" 7");

			}
		}
		if (i == 0)
		{
			System.out.print("n");
		}

	}
}

