package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[102][102];
		int n;
		int m;
		int i;
		int j;
		int k;
		int count = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 2;j++)
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
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 2;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '*';
						}
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '*';
						}
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '*';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '*';
						}
					}
				}
			}
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 2;j++)
				{
					if (a[i][j] == '*')
					{
						a[i][j] = '@';
					}
				}
			}
		}

		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 2;j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}

		System.out.printf("%d",count);

		return 0;
	}


}

