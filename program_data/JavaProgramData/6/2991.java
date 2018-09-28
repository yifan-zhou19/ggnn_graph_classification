package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int p;
		int q;
		int[][] N = new int[100][100];
		int m;
		int n;
		int sum = 0;
		for (i = 1;i <= k;i++)
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
			for (p = 1;p <= m;p++)
			{
				for (q = 1;q <= n;q++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						N[p][q] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 1;j <= n;j++)
			{
				sum += N[1][j];
			}
			for (j = 1;j <= n;j++)
			{
				sum += N[m][j];
			}
			for (j = 1;j <= m;j++)
			{
				sum += N[j][1];
			}
			for (j = 1;j <= m;j++)
			{
				sum += N[j][n];
			}
			sum = sum - N[1][1] - N[1][n] - N[m][1] - N[m][n];
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

