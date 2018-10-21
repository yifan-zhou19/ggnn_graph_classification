package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if (i % 3 == 0)
		{
			System.out.print("3");
		}
		if (i % 5 == 0)
		{
			if (i % 3 != 0)
			{
				System.out.print("5");
			}
			else
			{
				System.out.print(" 5");
			}
		}
		if (i % 7 == 0)
		{
			if (i % 3 == 0 || i % 5 == 0)
			{
				System.out.print(" 7");
			}
			else
			{
				System.out.print("7");
			}
		}
		if (i % 3 && i % 5 && i % 7)
		{
		System.out.print("n");
		}
	}
}

