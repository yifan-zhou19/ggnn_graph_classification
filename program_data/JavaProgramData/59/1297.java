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
		int[][] mark = new int[102][102];
		int[][] markb = new int[102][102];
		char[][] a = new char[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				mark[i][j] = 0;
			}
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
				if (a[i][j] == '.')
				{
					mark[i][j] = 0;
				}
				else if (a[i][j] == '@')
				{
					mark[i][j] = 1;
				}
				else
				{
					mark[i][j] = -1;
				}
				markb[i][j] = mark[i][j];
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
					if (mark[i][j] == 1)
					{
						if (mark[i + 1][j] == 0)
						{
							markb[i + 1][j] = 1;
						}
						if (mark[i - 1][j] == 0)
						{
							markb[i - 1][j] = 1;
						}
						if (mark[i][j + 1] == 0)
						{
							markb[i][j + 1] = 1;
						}
						if (mark[i][j - 1] == 0)
						{
							markb[i][j - 1] = 1;
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					mark[i][j] = markb[i][j];
				}
			}
		}
		int count = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (mark[i][j] == 1)
				{
					count++;
				}
			}
		}
		System.out.printf("%d",count);

		return 0;
	}

}

