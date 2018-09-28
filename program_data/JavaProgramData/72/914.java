package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[20][20];
		int i;
		int j;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && i != m - 1)
				{
					b = 0;
				}
				else
				{
					b = a[i - 1][j] - a[i][j];
				}
				if (j == 0 && j != n - 1)
				{
					c = 0;
				}
				else
				{
					c = a[i][j - 1] - a[i][j];
				}
				if (i == m - 1)
				{
					d = 0;
				}
				else
				{
					d = a[i + 1][j] - a[i][j];
				}
				if (j == n - 1)
				{
					e = 0;
				}
				else
				{
					e = a[i][j + 1] - a[i][j];
				}
				if (b <= 0 && c <= 0 && d <= 0 && e <= 0)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}

}

