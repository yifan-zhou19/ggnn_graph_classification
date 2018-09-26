package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int[][] q = new int[1][8];
		int[] k = new int[8];
		int z = 0;
		int[] p = new int[8];
		int finish = 0;
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
				k[i] = 0;
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
			q[0][i] = a[i][0];
			p[i] = 0;
				for (j = 1;j <= n - 1;j++)
				{
				if (a[i][j] > q[0][i])
				{
					q[0][i] = a[i][j];
				p[i] = j;
				}
				}
		}
		for (j = 0;j <= m - 1;j++)
		{
			for (i = 0;i <= m - 1;i++)
			{
				if (q[0][j] <= a[i][p[j]])
				{
					k[j] = k[j] + 1;
				}
			}
			if (k[j] == m)
			{
				System.out.printf("%d+%d\n",j,p[j]);
				finish = 1;
			}
		}
		if (finish == 0)
		{
				System.out.print("No\n");
		}
	}

}

