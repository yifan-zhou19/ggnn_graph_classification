package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] x = new int[1000];
	int[] y = new int[1000];
	int[] z = new int[1000];
	int[] a = new int[100];
	int[] b = new int[100];
	double[] s = new double[1000];
	double[] c = new double[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
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
	int t = 0;
	for (int i = 0;i < n;i++)
	{
	for (int k = i + 1;k < n;k++)
	{
	s[t] = (x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]) + (z[i] - z[k]) * (z[i] - z[k]);
	a[t] = i;
	b[t] = k;
	t++;
	}
	}
	double e;
	int r;
	for (int i = 0;i < t - 1;i++)
	{
	for (int k = 0;k < t - i - 1;k++)
	{
	if (s[k] < s[k + 1])
	{
					  e = s[k + 1];
	s[k + 1] = s[k];
					 s[k] = e;
	r = a[k + 1];
	a[k + 1] = a[k];
	a[k] = r;
	r = b[k + 1];
	b[k + 1] = b[k];
	b[k] = r;
	}
	}
	}
	for (int i = 0;i < t;i++)
	{
	c[i] = 1.0 * Math.sqrt(s[i]);
	}
	for (int i = 0;i < t;i++)
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a[i]],y[a[i]],z[a[i]],x[b[i]],y[b[i]],z[b[i]],c[i]);
	}
	return 0;
	}

}

