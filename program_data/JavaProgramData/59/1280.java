package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int s = 0;
		char[][] a = new char[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			System.in.read();
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[i][j] = tempVar2.charAt(0);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '*';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '*';
						}
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '*';
						}
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '*';
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '*')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				 if (a[i][j] == '@')
				 {
					 s++;
				 }
				// printf("%c ",a[i][j]);
			}
		}
		System.out.printf("%d",s);

		return 0;
	}

}

