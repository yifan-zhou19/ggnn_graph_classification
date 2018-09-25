package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[22][22];
		int m;
		int n;
		int i;
		int j;
		int c;
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
		for (i = 0;i <= m + 1;i++)
		{
			a[i][0] = -1;
			a[i][n + 1] = -1;
		}
		for (i = 0;i < n + 2;i++)
		{
			a[0][i] = -1;
			a[m + 1][i] = -1;

		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				c = a[i][j];
				if ((c >= a[i][j + 1]) && (c >= a[i][j - 1]) && (c >= a[i + 1][j]) && (c >= a[i - 1][j]))
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
			return 0;
	}

}

