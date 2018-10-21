package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		char[][] a = new char[103][104];
		int i;
		int j;
		int k;
		int count = 0;
		int[][] h = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i <= n + 1;i++)
		{
			a[0][i] = '#';
			a[n + 1][i] = '#';
		}
		for (i = 0;i <= n + 1;i++)
		{
			a[i][0] = '#';
			a[i][n + 1] = '#';
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)

			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[i][j] = tempVar2.charAt(0);
				}
			}
			System.in.read();
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		m = m - 1;
		while (m-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(h,0,(Integer.SIZE / Byte.SIZE));
		for (j = 1;j <= n;j++)
		{
				for (k = 1;k <= n;k++)
				{
					if (a[j][k] == '@')
					{
						h[j][k] = 1;
					}
				}
		}
			for (i = 1;i <= n;i++)
			{
				for (k = 1;k <= n;k++)
				{
					if (h[i][k] == 1)
					{
						if (a[i][k + 1] != '#')
						{
							a[i][k + 1] = '@';
						}
						if (a[i][k - 1] != '#')
						{
							a[i][k - 1] = '@';
						}
						if (a[i - 1][k] != '#')
						{
							a[i - 1][k] = '@';
						}
						if (a[i + 1][k] != '#')
						{
							a[i + 1][k] = '@';
						}
					}
				}
			}
				for (i = 0;i <= n + 1;i++)
				{
					a[0][i] = '#';
					a[n + 1][i] = '#';
				}
				for (i = 0;i <= n + 1;i++)
				{
					 a[i][0] = '#';
					 a[i][n + 1] = '#';
				}
		}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.printf("%d\n",count);

	return 0;
	}

}

