package <missing>;

public class GlobalMembers
{
	public static int peak(int[][] a, int i, int j)
	{
		if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int[][] a = new int[MAX][MAX];
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i < MAX;i++)
		{
			for (j = 0;j < MAX;j++)
			{
				a[i][j] = 0;
			}
		}

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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (peak(a, i, j) != 0)
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	}
}

