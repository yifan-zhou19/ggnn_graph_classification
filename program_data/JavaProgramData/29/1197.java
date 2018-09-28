package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 1;j <= sz[i];j++)
			{
				a[i][1] = 2;
				a[i][2] = 3;
				b[i][1] = 1;
				b[i][2] = 2;
				a[i][j + 2] = a[i][j] + a[i][j + 1];
				b[i][j + 2] = b[i][j] + b[i][j + 1];
			}
		}
		double[] sum = new double[100];
		for (i = 0;i < m;i++)
		{
			sum[i] = 0;
			for (j = 1;j <= sz[i];j++)
			{
				sum[i] += (a[i][j] * 1.0) / (b[i][j] * 1.0);
			}
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}

}

