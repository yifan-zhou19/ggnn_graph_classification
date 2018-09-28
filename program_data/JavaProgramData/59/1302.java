package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t;
		int j;
		int p = 0;
		char[][] a = new char[102][102];
		String c = new String(new char[101]);
		char[][] b = new char[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				a[i][j] = '#';
				b[i][j] = '#';
			}
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}

			for (j = 1;j <= n;j++)
			{
				a[i + 1][j] = c.charAt(j - 1);
				b[i + 1][j] = c.charAt(j - 1);
			}

		}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}

		for (i = 1;i < m;i++)
		{
			for (t = 1;t <= n;t++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[t][j] == '@')
					{
						if (a[t - 1][j] == '.')
						{
							b[t - 1][j] = '@';
						}
						if (a[t + 1][j] == '.')
						{
							b[t + 1][j] = '@';
						}
						if (a[t][j + 1] == '.')
						{
							b[t][j + 1] = '@';
						}
						if (a[t][j - 1] == '.')
						{
							b[t][j - 1] = '@';
						}
					}
				}
			}

					for (t = 1;t <= n;t++)
					{
				for (j = 1;j <= n;j++)
				{
					a[t][j] = b[t][j];
				}
					}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					p++;
				}
			}
		}
		System.out.printf("%d",p);
			return 0;
	}
































}

