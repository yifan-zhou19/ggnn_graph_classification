package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[9][9];
		int i;
		int j;
		int z;
		int b;
		int c;
		int[][] d = new int[9][9];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = 0;
				d[i][j] = 0;
			}
		}
		a[4][4] = m;
		d[4][4] = m;

		for (z = 1;z <= n;z++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (a[i][j] != 0)
					{
						for (b = i - 1;b <= i + 1;b++)
						{
							for (c = j - 1;c <= j + 1;c++)
							{
								d[b][c] += a[i][j];
							}
						}
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = d[i][j];
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j == 8)
				{
					System.out.printf("%d\n",d[i][j]);
				}
				else
				{
					System.out.printf("%d ",d[i][j]);
				}
			}
		}
		return 0;
	}

}

