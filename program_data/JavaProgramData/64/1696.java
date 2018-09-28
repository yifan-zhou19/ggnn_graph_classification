package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		double[][] l = new double[10][10];
		double[] d = new double[100];
		double m;
		int i;
		int j;
		int k;
		int n;
		int s = 0;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				l[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				d[s] = l[i][j];
				s += 1;
			}
		}
		for (i = 0;i < n * n;i++)
		{
			for (j = 0;j < n * (n - 1) / 2 - 1;j++)
			{
				if (d[j] < d[j + 1])
				{
					m = d[j];
					d[j] = d[j + 1];
					d[j + 1] = m;
				}
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
			while (d[k] == d[k - 1])
			{
				k += 1;
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (l[i][j] == d[k])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[i],y[i],z[i],x[j],y[j],z[j],d[k]);
					}
				}
			}
		}
		return 0;
	}
}

