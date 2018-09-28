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
	int[] x = new int[101];
	int[] y = new int[101];
	int[] z = new int[101];
	int[] a = new int[46];
	int[] b = new int[46];
	double[] d = new double[46];
	double t1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		z[i] = Integer.parseInt(tempVar4);
	}
	}
	k = 0;
	for (i = 1;i <= n - 1;i++)
	{
	for (j = i + 1;j <= n;j++)
	{
		k = k + 1;
		d[k] = Math.sqrt(1.0 * (x[i] - x[j]) * (x[i] - x[j]) + 1.0 * (y[i] - y[j]) * (y[i] - y[j]) + 1.0 * (z[i] - z[j]) * (z[i] - z[j]));
		a[k] = i;
		b[k] = j;
	}
	}
	for (i = 1;i <= k;i++)
	{
	for (j = 1;j <= k - i;j++)
	{
	if (d[j] < d[j + 1])
	{
	t1 = d[j];
	d[j] = d[j + 1];
	d[j + 1] = t1;
	t = a[j];
	a[j] = a[j + 1];
	a[j + 1] = t;
	t = b[j];
	b[j] = b[j + 1];
	b[j + 1] = t;
	}
	}
	}
	for (i = 1;i <= k;i++)
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a[i]],y[a[i]],z[a[i]],x[b[i]],y[b[i]],z[b[i]],d[i]);
	}
	return 0;
	}
}

