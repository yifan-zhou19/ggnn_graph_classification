package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int num = 0;
		char[][] c = new char[102][102];
		char[][] tmp = new char[102][102];
		int i;
		int j;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n + 1;j++) //?\n???
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					c[i][j] = tempVar2.charAt(0);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (d = 1;d < m;d++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (c[i][j] == '#')
					{
						tmp[i][j] = '#';
					}
					else
					{
						tmp[i][j] = '.';
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (c[i][j] == '@')
					{
						tmp[i][j] = '@';
						if (tmp[i][j - 1] != '#')
						{
							tmp[i][j - 1] = '@';
						}
						if (tmp[i][j + 1] != '#')
						{
							tmp[i][j + 1] = '@';
						}
						if (tmp[i - 1][j] != '#')
						{
							tmp[i - 1][j] = '@';
						}
						if (tmp[i + 1][j] != '#')
						{
							tmp[i + 1][j] = '@';
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					c[i][j] = tmp[i][j];
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.printf("%d\n",num);
		return 0;
	}

}

