package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int sum;
		char[][] a = new char[110][110];
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
		for (k = 0;k < m - 1;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						if ((i + 1 < n) && (i + 1 >= 0) && (a[i + 1][j] == '.'))
						{
							a[i + 1][j] = '!';
						}
						if ((i - 1 < n) && (i - 1 >= 0) && (a[i - 1][j] == '.'))
						{
							a[i - 1][j] = '!';
						}
						if ((j + 1 < n) && (j + 1 >= 0) && (a[i][j + 1] == '.'))
						{
							a[i][j + 1] = '!';
						}
						if ((j - 1 < n) && (j - 1 >= 0) && (a[i][j - 1] == '.'))
						{
							a[i][j - 1] = '!';
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
		sum = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					sum = sum + 1;
				}
			}
		}
			System.out.printf("%d",sum);

		return 0;
	}
}

