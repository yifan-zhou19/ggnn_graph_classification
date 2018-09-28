package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int k;
		int j;
		int p;
		int[][] a = new int[1000][1000];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
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
			for (j = 1;j <= m;j++)
			{
				for (p = 1;p <= n;p++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][p] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (p = 1;p <= n;p++)
			{
				sum += a[1][p];
			}
			for (j = 2;j <= m;j++)
			{
				sum += a[j][n];
			}
			for (p = n - 1;p >= 1;p--)
			{
				sum += a[m][p];
			}
			for (j = m - 1;j >= 2;j--)
			{
				sum += a[j][1];
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

