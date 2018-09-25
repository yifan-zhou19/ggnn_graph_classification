package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] h = new int[20][20];
		int[][] k = new int[20][20];
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				k[i][j] += cmp(h[i][j], h[i + 1][j]);
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				k[i][j] += cmp(h[i][j], h[i - 1][j]);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				k[i][j] += cmp(h[i][j], h[i][j + 1]);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < n;j++)
			{
				k[i][j] += cmp(h[i][j], h[i][j - 1]);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (k[i][j] == 0)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}
	public static int cmp(int a,int b)
	{
		return (a >= b != 0? 0:1);
	}
}

