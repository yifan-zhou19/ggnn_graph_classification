package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		double[] dis = new double[1000];
		double[] x = new double[100];
		double[] y = new double[100];
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				dis[m] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				m = m + 1;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (dis[j] > dis[j + 1])
				{
					q = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = q;
				}
			}
		}
		System.out.printf("%.4f\n",dis[m - 1]);
	}

}

