package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
			System.out.print("3");
			f++;
		};
		if (a % 5 == 0)
		{
			if (f != 0)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			f++;
		};
		if (a % 7 == 0)
		{
			if (f != 0)
			{
				System.out.print(" ");
			}
			System.out.print("7");
			f++;
		};
		if (f == 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

