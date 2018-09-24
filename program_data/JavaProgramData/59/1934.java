package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sz = new char[n + 2][n + 2];
		String sz2 = new String(new char[n + 2]);
		for (i = 1;i < n + 1;i++)
		{
			scanf("%*c");
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					(sz[i][j]) = tempVar2.charAt(0);
				}

			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (j = 0;j <= n + 1;j++)
		{
			sz[0][j] = '#';
			sz[n + 1][j] = '#';
		}
		for (i = 0;i <= n + 1;i++)
		{
			sz[i][0] = '#';
			sz[i][n + 1] = '#';
		}
		for (k = 0;k < m - 1;k++)
		{
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (sz[i][j] == 'a')
			{
				sz[i][j] = '@';
			}
		}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
	if (sz[i][j] == '@')
	{
	if (sz[i][j + 1] == '.')
	{
	sz[i][j + 1] = 'a';
	}
	else
	{
	}
	if (sz[i][j - 1] == '.')
	{
	sz[i][j - 1] = 'a';
	}
	else
	{
	}
	if (sz[i + 1][j] == '.')
	{
	sz[i + 1][j] = 'a';
	}
	else
	{
	}
	if (sz[i - 1][j] == '.')
	{
	sz[i - 1][j] = 'a';
	}
	else
	{
	}
	}
	}
	}
		}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if ((sz[i][j] == '@') || (sz[i][j] == 'a'))
				{
					p = p + 1;
				}
			}
		}
		System.out.printf("%d",p);
		return 0;
	}



}

