package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int num = 0;
		int k;
		char[][] a = new char[102][103];
		char[][] b = new char[102][103];
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = n - 1;j >= 0;j--)
			{
				a[i][j + 1] = a[i][j];
			}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				b[i][j] = a[i][j];
			}
		}
		for (k = 1;k < m;k++)
		{
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					if (b[i - 1][j] == '.')
					{
						b[i - 1][j] = '@';
					}
					if (b[i + 1][j] == '.')
					{
						b[i + 1][j] = '@';
					}
					if (b[i][j - 1] == '.')
					{
						b[i][j - 1] = '@';
					}
					if (b[i][j + 1] == '.')
					{
						b[i][j + 1] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = b[i][j];
			}
		}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (b[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.printf("%d",num);
		return 0;
	}


}

