package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int count = 0;
		char[][] a = new char[100][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (m == 1)
		{
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
			}
			System.out.printf("%d",count);
		}
		else
		{
		for (k = 1;k < m;k++)
		{
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					if (j != n - 1)
					{
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '!';
						}
					}
					if (j != 0)
					{
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '!';
						}
					}
					if (i != n - 1)
					{
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '!';
						}
					}
					if (i != 0)
					{
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '!';
						}
					}
				}
			}
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '!')
					{
						a[i][j] = '@';
					}
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
			System.out.printf("%d",count);
		}
	}


}

