package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int j;
	int e;
	int[] x = new int[101];
	int[] y = new int[101];
	int[] z = new int[101];
	int[] a = new int[20000];
	int[] b = new int[20000];
	int[] s = new int[10000];
	int t = 0;
	double[] c = new double[10000];
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
	for (int i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	s[t] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
	a[t] = i;
	b[t] = j;
	t++;
	}
	}


	for (int i = 0;i < t - 1;i++)
	{
	for (j = 0;j < t - i - 1;j++)
	{
	if (s[j] < s[j + 1])
	{
					  e = s[j + 1];
	s[j + 1] = s[j];
					 s[j] = e;
	e = a[j + 1];
	a[j + 1] = a[j];
	a[j] = e;
	e = b[j + 1];
	b[j + 1] = b[j];
	b[j] = e;
	}
	}
	}
	for (m = 0;m < t;m++)
	{
	c[m] = 1.0 * Math.sqrt(s[m]);
	}
	for (m = 0;m < t;m++)
	{
		   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a[m]],y[a[m]],z[a[m]],x[b[m]],y[b[m]],z[b[m]],c[m]);
	}

	return 0;
	}

}

