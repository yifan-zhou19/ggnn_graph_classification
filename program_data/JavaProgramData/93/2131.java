package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int k = 0;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
			k = 1;

		}
		if (a % 5 == 0)
		{
			i = 1;

		}
		if (a % 7 == 0)
		{
			j = 1;

		}
		if (k == 0 && i == 0 && j == 0)
		{
		System.out.print("n");
		}
		if (k == 1)
		{
		System.out.print("3");
		}
		if (i == 1)
		{
			if (k == 1)
			{
			System.out.print(" 5");
			}
			else
			{
				System.out.print("5");
			}
		}
		if (j == 1)
		{
			if (i == 1 || k == 1)
			{
			System.out.print(" 7");
			}
			else
			{
				System.out.print("7");
			}
		}


		 return 0;
	}
}

