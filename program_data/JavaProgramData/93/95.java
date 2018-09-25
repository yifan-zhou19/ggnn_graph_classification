package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 105 == 0)
		{
			System.out.print("3 5 7\n");
		}
		else if (n % 35 == 0 && n % 3 != 0)
		{
			System.out.print("5 7\n");
		}
		else if (n % 15 == 0 && n % 7 != 0)
		{
			System.out.print("3 5\n");
		}
		else if (n % 21 == 0 && n % 5 != 0)
		{
			System.out.print("3 7\n");
		}
		else if (n % 3 == 0 && n % 35 != 0)
		{
			System.out.print("3\n");
		}
		else if (n % 5 == 0 && n % 21 != 0)
		{
			System.out.print("5\n");
		}
		else if (n % 7 == 0 && n % 15 != 0)
		{
			System.out.print("7\n");
		}
	else
	{
	System.out.print("n\n");
	}
	}

}

