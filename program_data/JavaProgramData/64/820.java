package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int M;
	M = N * (N - 1) / 2;
	int[] x = new int[N];
	int[] y = new int[N];
	int[] z = new int[N];
	int[] d = new int[M];
	int[] a = new int[M];
	int[] b = new int[M];
	int p = 0;
	int i;
	int j;
	int n;
	int k;
	int m;
	double c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.out.print("\n");
	for (i = 0;i < n;i++)
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
	System.out.print("\n");
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	d[p] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
	a[p] = i;
	b[p] = j;
	p++;
	}
	}
	for (j = 1;j <= p;j++)
	{
	for (i = 0;i < p - j;i++)
	{
	if (d[i] < d[i + 1])
	{
	d[i] = d[i] + d[i + 1];
	d[i + 1] = d[i] - d[i + 1];
	d[i] = d[i] - d[i + 1];
	a[i] = a[i] + a[i + 1];
	a[i + 1] = a[i] - a[i + 1];
	a[i] = a[i] - a[i + 1];
	b[i] = b[i] + b[i + 1];
	b[i + 1] = b[i] - b[i + 1];
	b[i] = b[i] - b[i + 1];
	}
	}
	}
	for (i = 0;i < p;i++)
	{
	k = a[i];
	m = b[i];
	c = Math.sqrt(d[i]);
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[k],y[k],z[k],x[m],y[m],z[m],c);
	}
	return 0;
	}


}

