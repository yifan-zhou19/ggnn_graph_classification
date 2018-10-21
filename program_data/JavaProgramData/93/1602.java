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
			for (int i = 5;i < 8;i += 2)
			{
			if (a % i == 0)
			{
				System.out.printf(" %d",i);
			}
			}
		}
		else
		{
			if (a % 5 == 0 && a % 7 == 0)
			{
				System.out.print("5 7");
			}
			else if (a % 5 == 0 && a % 7 != 0)
			{
				System.out.print("5");
			}
			else if (a % 5 != 0 && a % 7 == 0)
			{
				System.out.print("7");
			}
			else
			{
				System.out.print("n");
			}
		}
		return 0;
	}
}

