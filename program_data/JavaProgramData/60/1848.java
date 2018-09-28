package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int y;
	public static int q = 12;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 3;n <= m - 2;n++)
		{
			for (i = 2;i <= n - 1;i++)
			{
				if (n % i == 0)
				{
					y = 1;
				}

			}
			if (y != 1)
			{
				for (i = 2;i <= n + 1;i++)
				{
					if ((n + 2) % i == 0)
					{
						y = 1;
					}

				}
				if (y != 1)
				{
					System.out.printf("%d %d\n\n",n,n + 2);
					q = 3;

				}


			}
			y = 12;
		}
		if (q == 12)
		{
		System.out.print("empty");
		}
	}
}

