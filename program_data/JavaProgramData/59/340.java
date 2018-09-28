package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int m;
		int s = 0;
		char[][] a = new char[105][105];
		char[][] b = new char[105][105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= n;i++)
		{
			a[i][n] = a[n][i] = '#';
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (j = 0;j <= n;j++)
		{
			for (k = 0;k <= n;k++)
			{
					b[j][k] = a[j][k];
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (a[j][k] == '.')
					{
						if (a[j][k + 1] == '@' || a[j + 1][k] == '@')
						{
							b[j][k] = '@';
						}
					else
					{
						if (k != 0)
						{
						if (a[j][k - 1] == '@')
						{
							b[j][k] = '@';
						}
						}
					 if (i != 0)
					 {
						if (a[j - 1][k] == '@')
						{
							b[j][k] = '@';
						}
					 }
					}
					}
					else
					{
						b[j][k] = a[j][k];
					}
				}
			}
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = b[j][k];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
			s++;
				}
			}
		}
				System.out.printf("%d",s);
		return 0;
	}


}

