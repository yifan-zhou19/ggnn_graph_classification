package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int k;
		int i;
		int j;
		int t;
		int m;
		int n;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (t = 1;t <= k;t++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 2;i < n;i++)
			{
				sum += a[1][i] + a[m][i];
			}
			for (j = 2;j < m;j++)
			{
				sum += a[j][1] + a[j][n];
			}
			sum += a[1][1] + (n != 1) * a[1][n] + (m != 1) * a[m][1] + (m != 1) * a[m][n];
			if (t < k)
			{
				System.out.printf("%d\n",sum);
			}
			else
			{
				System.out.printf("%d",sum);
			}
		}
		return 0;
	}
}

