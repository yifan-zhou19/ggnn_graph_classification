package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] z = new double[100];
		double[] c = new double[100];
		double[][] l = new double[100][100];
		double e;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int m;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		m = 0;
		for (i = 0;i < n;i++)
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
		for (i = 0;i < n;i++)
		{
			for (j = (i + 1);j < n;j++)
			{
				l[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				c[m] = l[i][j];
				a[m] = i;
				b[m] = j;
				m = m + 1;
			}
		}
		for (p = 0;p < m;p++)
		{
			for (q = 0;q < (m - 1 - p);q++)
			{
				if (c[q] > c[q + 1])
				{
					e = c[q + 1];
					c[q + 1] = c[q];
					c[q] = e;
					e = a[q + 1];
					a[q + 1] = a[q];
					a[q] = e;
					e = b[q + 1];
					b[q + 1] = b[q];
					b[q] = e;
				}
			}
		}
		for (p = 0;p < m;p++)
		{
			for (q = 0;q < (m - 1 - p);q++)
			{
				if (c[q] == c[q + 1])
				{
					if (a[q] < a[q + 1] || b[q] < b[q + 1])
					{
						e = a[q + 1];
						a[q + 1] = a[q];
						a[q] = e;
						e = b[q + 1];
						b[q + 1] = b[q];
						b[q] = e;
					}
				}
			}
		}
		for (i = m - 1;i >= 0;i--)
		{
			System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",x[a[i]],y[a[i]],z[a[i]],x[b[i]],y[b[i]],z[b[i]],c[i]);
		}
		return 0;
	}





}

