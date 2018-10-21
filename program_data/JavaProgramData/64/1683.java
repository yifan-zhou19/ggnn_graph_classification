package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x = new double[150];
		double[] y = new double[150];
		double[] z = new double[150];
		int i;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Double.parseDouble(tempVar4);
			}
		}
		int j;
		int h;
		h = 1;
		double sum;
		double[][] s1 = new double[150][150];
		double[][] s2 = new double[150][150];
		double[] a = new double[10000];
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				sum = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
				s1[i][j] = Math.sqrt(sum);
				s2[i][j] = s1[i][j];
				a[h] = s1[i][j];
				h++;
			}
		}
		h--;
		int k;
		double e;
		for (k = 1;k < h;k++)
		{
			for (i = 1;i <= h - k;i++)
			{
				if (a[i] < a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
				}
			}
		}
		int count = 2;
		double[] b = new double[10000];
		b[1] = a[1];
		for (i = 2;i <= h;i++)
		{
			if (a[i] != a[i - 1])
			{
				b[count] = a[i];
				count++;
			}
		}
		count--;
		for (k = 1;k <= count;k++)
		{
			for (i = 1;i < n;i++)
			{
				for (j = i + 1;j <= n;j++)
				{
					if (s1[i][j] == b[k])
					{
						System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",x[i],y[i],z[i],x[j],y[j],z[j],b[k]);
					}
				}
			}
		}
		return 0;
	}
}

