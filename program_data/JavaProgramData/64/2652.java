package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int m;
		int pair;
		double e;
		double[][] sz = new double[10][3];
		double[][] num = new double[45][7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		pair = n * (n - 1) / 2;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][j] = Double.parseDouble(tempVar2);
			}
			}
		}
		m = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				for (k = 0;k < 3;k++)
				{
				num[m][k] = sz[i][k];
				}
				for (t = 3;t < 6;t++)
				{
				num[m][t] = sz[j][t - 3];
				}
				num[m][6] = Math.sqrt((num[m][0] - num[m][3]) * (num[m][0] - num[m][3]) + (num[m][1] - num[m][4]) * (num[m][1] - num[m][4]) + (num[m][2] - num[m][5]) * (num[m][2] - num[m][5]));
				m++;
			}
		}
		for (k = 1;k <= pair;k++)
		{
			for (i = 0;i < pair - k;i++)
			{
				if (num[i][6] < num[i + 1][6])
				{
					for (t = 0;t < 7;t++)
					{
					e = num[i + 1][t];
					num[i + 1][t] = num[i][t];
					   num[i][t] = e;
					}
				}
			}
		}
		for (t = 0;t < pair;t++)
		{
		System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",(num[t][0]),(num[t][1]),(num[t][2]),(num[t][3]),(num[t][4]),(num[t][5]),(num[t][6]));
		}
	return 0;
	}

}

