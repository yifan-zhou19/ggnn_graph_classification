package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int row;
		int col;
		int x;
		char[][] a = new char[102][102];
		char[][] c = new char[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = 0;
		for (row = 1;row <= n;row++)
		{
			scanf("\n");
			for (col = 1;col <= n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					(a[row][col]) = tempVar2.charAt(0);
				}
			}
		}
		scanf("\n");
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (int b = 0;b <= n + 1;b++)
		{
			a[b][0] = a[b][n + 1] = a[0][b] = a[n + 1][b] = '#';
			c[b][0] = c[b][n + 1] = c[0][b] = c[n + 1][b] = '#';
		}
		for (int i = 0;i < m - 1;i++)
		{
			for (row = 1;row <= n;row++)
			{
				for (col = 1;col <= n;col++)
				{
					c[row][col] = a[row][col];
				}
			}
			for (row = 1;row <= n;row++)
			{
				for (col = 1;col <= n;col++)
				{
					if (a[row][col] == '@')
					{
						if (a[row][col + 1] != '#')
						{
							c[row][col + 1] = '@';
						}
						if (a[row][col - 1] != '#')
						{
							c[row][col - 1] = '@';
						}
						if (a[row + 1][col] != '#')
						{
							c[row + 1][col] = '@';
						}
						if (a[row - 1][col] != '#')
						{
							c[row - 1][col] = '@';
						}
					}
				}
			}
			for (row = 1;row <= n;row++)
			{
				for (col = 1;col <= n;col++)
				{
					a[row][col] = c[row][col];
				}
			}
		}
		for (row = 1;row <= n;row++)
		{
			for (col = 1;col <= n;col++)
			{
				if (a[row][col] == '@')
				{
					x++;
				}
			}
		}
		System.out.printf("%d",x);
		return 0;
	}

}

