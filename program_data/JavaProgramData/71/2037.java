package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int j;
		int[] e = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] f = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int d = 0;
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if ((a % 100 != 0 && a % 4 == 0) || (a % 100 == 0 && a % 400 == 0))
			{
				if (b > c)
				{
					for (j = c;j < b;j++)
					{
						d += e[j - 1];
					}
				}
				else if (c > b)
				{
					for (j = b;j < c;j++)
					{
						d += e[j - 1];
					}

				}
				if (d % 7 == 0)
				{
					System.out.print("\nYES");
				}
				else
				{
					System.out.print("\nNO");
				}
			}
			else
			{
				if (b > c)
				{
					for (j = c;j < b;j++)
					{
						d += f[j - 1];
					}
				}
				else if (c > b)
				{
					for (j = b;j < c;j++)
					{
						d += f[j - 1];
					}

				}
				if (d % 7 == 0)
				{
					System.out.print("\nYES");
				}
				else
				{
					System.out.print("\nNO");
				}
			}
		}
		return 0;
	}
}

