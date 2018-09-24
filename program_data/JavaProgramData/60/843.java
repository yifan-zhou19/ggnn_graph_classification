package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int x = 0;
		int y = 0;
		int z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1 || n == 2 || n == 3 || n == 4)
		{
			System.out.print("empty");
		}
		if (n > 4)
		{
			for (i = 3;i <= n - 2;i++)
			{
				x = 0;
				for (j = i;j > 0;j--)
				{
					if (i % j == 0)
					{
						x += 1;
					}
				}
			if (x == 2)
			{
				y = 0;
				for (j = i + 2;j > 0;j--)
				{
					if ((i + 2) % j == 0)
					{
						y += 1;
					}
				}
				if (y == 2)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}

			}
			}
		}
		return 0;
	}
}

