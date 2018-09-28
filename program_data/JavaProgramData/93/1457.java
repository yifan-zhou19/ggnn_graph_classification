package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
			System.out.print("3");
			if (a % 5 == 0)
			{
				System.out.print(" 5");
			}
			if (a % 7 == 0)
			{
				System.out.print(" 7");
			}
		}
		else if (a % 5 == 0)
		{
			System.out.print("5");
			if (a % 7 == 0)
			{
				System.out.print(" 7");
			}
		}
		else if (a % 7 == 0)
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

