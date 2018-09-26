package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int r;
		int i;
		int j;
		int m;
		int sum = 0;
		char[][] sz = new char[100][100];
		char[][] SZ = new char[100][100];
		String zfc = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
		  for (j = 0;j < n;j++)
		  {
				sz[i][j + 1] = zfc.charAt(j);
				SZ[i][j + 1] = zfc.charAt(j);
		  }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (r = 1;r <= m - 1;r++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (sz[i][j] == '@' && sz[i - 1][j] != '#')
					{
						SZ[i - 1][j] = '@';
					}
					if (sz[i][j] == '@' && sz[i + 1][j] != '#')
					{
						SZ[i + 1][j] = '@';
					}
					if (sz[i][j] == '@' && sz[i][j - 1] != '#')
					{
						SZ[i][j - 1] = '@';
					}
					if (sz[i][j] == '@' && sz[i][j + 1] != '#')
					{
						SZ[i][j + 1] = '@';
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					sz[i][j] = SZ[i][j];
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
					if (sz[i][j] == '@')
					{
						sum++;
					}
				}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

