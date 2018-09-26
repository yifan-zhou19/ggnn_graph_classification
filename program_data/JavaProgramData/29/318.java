package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int j;
	int k;
	double[] a = new double[1000];
	double[] b = new double[1000];
	double[] c = new double[1000];
	double[] sum = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a[0] = 2;
	a[1] = 3;
	b[1] = 2;
	b[0] = 1;
	for (i = 2;i < 1000;i++)
	{
	a[i] = a[i - 1] + a[i - 2];
	b[i] = a[i - 1];
	}
	for (i = 0;i < 1000;i++)
	{
	c[i] = a[i] / b[i];
	}
	for (j = 0;j < n;j++)
	{
	sum[j] = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < k;i++)
	{
	sum[j] = sum[j] + c[i];
	}
	System.out.printf("%.3lf\n",sum[j]);
	}
	return 0;
	}
}

