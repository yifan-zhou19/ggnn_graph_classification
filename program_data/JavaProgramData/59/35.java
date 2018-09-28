package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int n;
		int i;
		int k;
		int q;
		int j;
		int w;
		int e;
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
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
					b[i][j] = a[i][j];
			}
		}
		int empty = 0;
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '#')
					{
						empty++;
					}
				}
		}
		int num = n * n - empty;
		for (q = 1;q < k;q++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
						if (i > 0 && a[i][j] == '@' && a[i - 1][j] == '.')
						{
							b[i - 1][j] = '@';
						}
						if (j > 0 && a[i][j] == '@' && a[i][j - 1] == '.')
						{
							b[i][j - 1] = '@';
						}
						if (j < n && a[i][j] == '@' && a[i][j + 1] == '.')
						{
							b[i][j + 1] = '@';
						}
						if (i < n && a[i][j] == '@' && a[i + 1][j] == '.')
						{
							b[i + 1][j] = '@';
						}
						if (a[i][j] == '@')
						{
							b[i][j] = '@';
						}
				}
			}
			for (w = 0;w < n;w++)
			{
				for (e = 0;e < n;e++)
				{
					a[w][e] = b[w][e];
				}
			}
		}
		int x = 0;
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						x = x + 1;
					}
				}
		}

			System.out.printf("%d",x);



	}
}

