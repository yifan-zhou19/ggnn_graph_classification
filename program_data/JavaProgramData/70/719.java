package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		double[][] a = new double[100][2];
		double[] dis = new double[5000];
		double max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
			k = 0;
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					dis[k++] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				}
			}
				max = dis[0];
				for (i = 1;i <= k;i++)
				{
					if (dis[i] > max)
					{
						max = dis[i];
					}
				}
					System.out.printf("%.4lf\n",max);
	}



}

