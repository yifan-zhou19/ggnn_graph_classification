package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[200][200];
	public static int[][] b = new int[200][200];
	public static int Main()
	{
		int n;
		int m;
		char tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (int i = 1; i <= n; ++i)
		{
			for (int j = 1; j <= n; ++j)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == '@')
				{
					b[i][j] = 1;
				}

			}
			System.in.read();
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (int k = 1; k < m; k++)
		{
			for (int i = 1; i <= n; ++i)
			{
				for (int j = 1; j <= n; ++j)
				{
					if (a[i][j] == '@' && b[i][j] == k)
					{
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '@';
							b[i + 1][j] = k + 1;
						}
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '@';
							b[i - 1][j] = k + 1;
						}
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '@';
							b[i][j + 1] = k + 1;
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '@';
							b[i][j - 1] = k + 1;
						}
					}
				}
			}
		}
		int cnt = 0;
		for (int i = 1; i <= n; ++i)
		{
			for (int j = 1; j <= n; ++j)
			{
				if (a[i][j] == '@')
				{
					cnt++;
				}
			}
		}
		System.out.printf("%d", cnt);
	}
}

