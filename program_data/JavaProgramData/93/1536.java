package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
		{
			System.out.print("3 5 7");
			return 0;
		}
	if (i % 3 != 0 && i % 5 == 0 && i % 7 == 0)
	{
			System.out.print("5 7");
			return 0;
	}
		if (i % 3 == 0 && i % 5 != 0 && i % 7 == 0)
		{
			System.out.print("3 7");
			return 0;
		}
		if (i % 3 == 0 && i % 5 == 0 && i % 7 != 0)
		{
			System.out.print("3 5");
			return 0;
		}

	if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0)
	{
			System.out.print("3");
			return 0;
	}
		if (i % 3 != 0 && i % 5 == 0 && i % 7 != 0)
		{
			System.out.print("5");
			return 0;
		}
		if (i % 3 != 0 && i % 5 != 0 && i % 7 == 0)
		{
			System.out.print("7");
			return 0;
		}
	if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
	{
			System.out.print("n");
			return 0;
	}


		return 0;
	}

}

