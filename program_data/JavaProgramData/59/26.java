package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[105][105];
		int n;
		int m;
		int i;
		int j;
		int ans = 0;
		int[][] a = new int[105][105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				a[i][j] = 0;
				c[i][j] = '#';
			}
		}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 0;j < n + 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					c[i][j] = tempVar2.charAt(0);
				}
				if (c[i][j] == '@')
				{
					a[i][j] = 1;
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		m--;
		while (m-- != 0)
		{
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 1;j++)
				{
					if ((c[i][j] == '@') && (a[i][j] == 1))
					{
						if (c[i - 1][j] == '.')
						{
							c[i - 1][j] = '@';
							a[i - 1][j] = 1;
						}
						if (c[i][j - 1] == '.')
						{
							c[i][j - 1] = '@';
							a[i][j - 1] = 1;
						}
						if (c[i + 1][j] == '.')
						{
							c[i + 1][j] = '@';
						}
						if (c[i][j + 1] == '.')
						{
							c[i][j + 1] = '@';
						}
					}
					if ((c[i][j] == '@') && (a[i][j] == 0))
					{
						a[i][j] = 1;
					}
				}
			}
		}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (c[i][j] == '@')
				{
					ans++;
				}
			}
		}
		System.out.printf("%d",ans);
		return 0;
	}
}

