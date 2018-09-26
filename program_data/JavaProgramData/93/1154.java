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
		if (n % 105 == 0)
		{
			System.out.print("3 5 7");
		}
		else if (n % 35 == 0)
		{
			System.out.print("5 7");
		}
		else if (n % 21 == 0)
		{
			System.out.print("3 7");
		}
		else if (n % 15 == 0)
		{
			System.out.print("3 5");
		}
		else if (n % 7 == 0)
		{
			System.out.print("7");
		}
		else if (n % 5 == 0)
		{
			System.out.print("5");
		}
		else if (n % 3 == 0)
		{
			System.out.print("3");
		}
		else if (n % 3 != 0 && n % 5 != 0 && n % 7 != 0)
		{
			System.out.print("n\n");
		}

	}
}

