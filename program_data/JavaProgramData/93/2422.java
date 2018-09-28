package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int f = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
			System.out.print("3");
			f = 0;
		}
		if (a % 5 == 0)
		{
			if (f == 0)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			f = 0;
		}
		if (a % 7 == 0)
		{
			if (f == 0)
			{
				System.out.print(" ");
			}
			System.out.print("7");
			f = 0;
		}
		if (f != 0)
		{
			System.out.print("n");
		}
		System.out.print("\n");
		return 0;
	}
}

