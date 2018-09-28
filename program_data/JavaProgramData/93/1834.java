package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % 3 == 0)
		{
			System.out.print("3");
			n++;
		}
		if (x % 5 == 0)
		{
			if (n != 0)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			n++;
		}
		if (x % 7 == 0)
		{
			if (n != 0)
			{
				System.out.print(" ");
			}
			System.out.print("7");
			n++;
		}
		if (n == 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

