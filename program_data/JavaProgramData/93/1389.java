package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			if (n % 5 == 0)
			{
				if (n % 7 == 0)
				{
					System.out.print("3 5 7");
				}
				else
				{
					System.out.print("3 5");
				}
			}
			else if (n % 5 != 0)
			{
				if (n % 7 == 0)
				{
					System.out.print("3 7");
				}
				else
				{
					System.out.print("3");
				}
			}
		}
		if (n % 3 != 0)
		{
			if (n % 5 == 0)
			{
				if (n % 7 == 0)
				{
					System.out.print("5 7");
				}
				else
				{
					System.out.print("5");
				}
			}
			else if (n % 5 != 0)
			{
				if (n % 7 == 0)
				{
					System.out.print("7");
				}
				else
				{
					System.out.print("n");
				}
			}
		}
		return 0;
	}

}

