package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
		System.out.print("3");
		s = 1;
		}
		if (a % 5 == 0)
		{
			if (s == 1)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			s = 1;
		}
		if (a % 7 == 0)
		{
			if (s == 1)
			{
				System.out.print(" ");
			}
			System.out.print("7");
		}
		if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

