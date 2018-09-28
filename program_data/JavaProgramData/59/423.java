package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] k = new int[101][101];
		char di;
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					di = tempVar2.charAt(0);
				}
				if (di == '#')
				{
					k[i][j] = 2;
				}
				else if (di == '@')
				{
					k[i][j] = 1;
				}
				else if (di == '.')
				{
					k[i][j] = 0;
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		int p;
		for (p = 1;p <= m - 1;p++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (k[i][j] == 1)
					{
						if (i - 1 >= 0)
						{
							if (k[i - 1][j] == 0)
							{
								k[i - 1][j] = -1;
							}
						}
						if (i + 1 <= n - 1)
						{
							if (k[i + 1][j] == 0)
							{
								k[i + 1][j] = -1;
							}
						}
						if (j - 1 >= 0)
						{
							if (k[i][j - 1] == 0)
							{
								k[i][j - 1] = -1;
							}
						}
						if (j + 1 <= n - 1)
						{
							if (k[i][j + 1] == 0)
							{
								k[i][j + 1] = -1;
							}
						}
					}
				}

			}
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (k[i][j] == -1)
				{
					k[i][j] = 1;
				}
			}
			}
		}
		int sum = 0;
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (k[i][j] == 1)
				{
					sum++;
				}
			}
			}
			System.out.printf("%d",sum);
			return 0;
	}
}

