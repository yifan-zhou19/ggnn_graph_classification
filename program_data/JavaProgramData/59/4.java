package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[103][103];
		int i;
		int j;
		int count = 0;
		String c = new String(new char[103]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 2;i++)
		{
			a[0][i] = -1;
			a[n + 1][i] = -1;
			a[i][0] = -1;
			a[i][n + 1] = -1;
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			for (j = 0;j < n;j++)
			{
				if (c.charAt(j) == '.')
				{
					a[i][j + 1] = 0;
				}
				else if (c.charAt(j) == '#')
				{
					a[i][j + 1] = -1;
				}
				else if (c.charAt(j) == '@')
				{
					a[i][j + 1] = 1;
					count++;
				}
			}

		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		int k = 2;
		for (k = 2;k <= m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == 0)
					{
						if (a[i + 1][j] >= 1 || a[i][j + 1] >= 1)
						{
							a[i][j] = k;
							count++;
						}
						else if (a[i - 1][j] >= 1 && a[i - 1][j] != k)
						{
							a[i][j] = k;
							count++;
						}
						else if (a[i][j - 1] >= 1 && a[i][j - 1] != k)
						{
							a[i][j] = k;
							count++;

						}
					}

				}
			}
		}
		System.out.printf("%d\n",count);

		return 0;
	}


}

