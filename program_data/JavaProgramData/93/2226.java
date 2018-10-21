package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % 3 == 0)
		{
			i = i + 1;
			System.out.print("3");
		}
		if (x % 5 == 0)
		{
			i = i + 1;
			if (i >= 2)
			{
				System.out.print(" 5");
			}
			else
			{
				System.out.print("5");
			}
		}
		if (x % 7 == 0)
		{
			i = i + 1;
			if (i >= 2)
			{
				System.out.print(" 7");
			}
			else
			{
				System.out.print("7");
			}
		}
		if (i == 0)
		{
			System.out.print("n");
		}
	}

}

