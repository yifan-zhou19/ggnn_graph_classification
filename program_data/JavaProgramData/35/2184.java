package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[8][8];
	public static int judge1(int i,int j)
	{
		int k;
		int u = 1;
		for (k = 0;k <= n - 1;k++)
		{
			if (a[i][j] < a[i][k])
			{
				u = 0;
			}
		}
		return u;
	}
	public static int judge2(int i,int j)
	{
		int k;
		int u = 1;
		for (k = 0;k <= m - 1;k++)
		{
			if (a[i][j] > a[k][j])
			{
				u = 0;
			}
		}
		return u;
	}
	public static void Main()
	{
		int i;
		int j;
		int u = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (judge1(i, j) == 1 && judge2(i, j) == 1)
				{
					u = 1;
					System.out.printf("%d+%d",i,j);
				}
			}
		}
		if (u == 0)
		{
			System.out.print("No");
		}
	}

}

