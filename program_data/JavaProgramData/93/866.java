package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % 3 == 0 && x % 5 == 0 && x % 7 == 0)
		{
			System.out.print("3 5 7");
		}
		else if (x % 3 == 0)
		{
			if (x % 5 == 0)
			{
				System.out.print("3 5");
			}
			else if (x % 7 == 0)
			{
				System.out.print("3 7");
			}
			else
			{
				System.out.print("3");
			}
		}
		else if (x % 5 == 0)
		{
			if (x % 7 == 0)
			{
				System.out.print("5 7");
			}
			else
			{
				System.out.print("5");
			}
		}
		else if (x % 7 == 0)
		{
			System.out.print("7");
		}
		else
		{
			System.out.print("n");
		}
		return 0;
	}
}

