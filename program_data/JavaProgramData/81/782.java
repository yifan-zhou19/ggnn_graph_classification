package <missing>;

public class GlobalMembers
{
	public static int change(int a, int b)
	{
		int i;
		int j;
		int y;

		if (a > 4 || b > 4)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				y = x[a][i];
				x[a][i] = x[b][i];
				x[b][i] = y;
			}
		}
		return 1;
	}
	public static int[][] x = new int[5][5];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = change(a, b);
		if (n == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",x[i][j]);
					}
					else
					{
						System.out.printf(" %d",x[i][j]);
					}
				}
				System.out.print("\n");
			}
		}

		return 0;

	}

}

