package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int r;
	int[] a = new int[10];
	int[] b = new int[10];
	int[] c = new int[10];
	int[] f = new int[100];
	int[] g = new int[100];
	int[] h = new int[100];
	int[] x = new int[100];
	int[] y = new int[100];
	int[] z = new int[100];
	double[] d = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c[i] = Integer.parseInt(tempVar4);
	}
	}
	for (i = n - 2;i >= 0;i--)
	{
	for (j = n - 1;j > i;j--)
	{
	d[m] = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]);
	d[m] = Math.sqrt(d[m]);
	f[m] = a[i];
	g[m] = b[i];
	h[m] = c[i];
	x[m] = a[j];
	y[m] = b[j];
	z[m] = c[j];
	m = m + 1;
	}
	}
	for (j = m - 1;j > 0;j--)
	{
		for (r = 0;r < j;r++)
		{
			if (d[r] > d[r + 1])
			{
				double tmp;
				int t1;
				int t2;
				int t3;
				int t4;
				int t5;
				int t6;
				tmp = d[r + 1];
				t1 = f[r + 1];
				t2 = g[r + 1];
				t3 = h[r + 1];
				t4 = x[r + 1];
				t5 = y[r + 1];
				t6 = z[r + 1];
				d[r + 1] = d[r];
				f[r + 1] = f[r];
				g[r + 1] = g[r];
				h[r + 1] = h[r];
				x[r + 1] = x[r];
				y[r + 1] = y[r];
				z[r + 1] = z[r];
				d[r] = tmp;
				f[r] = t1;
				g[r] = t2;
				h[r] = t3;
				x[r] = t4;
				y[r] = t5;
				z[r] = t6;
			}
		}
	}
	for (i = m - 1;i >= 0;i--)
	{
	 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",f[i],g[i],h[i],x[i],y[i],z[i],d[i]);
	}
	return 0;
	}

}

