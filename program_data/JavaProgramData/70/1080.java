package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double[] a = new double[200];
	double[] b = new double[200];
	double[] c = new double[200];
	int n;
	int i;
	double max = 0;
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
		a[i] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Double.parseDouble(tempVar3);
	}
	c[i] = Math.sqrt(a[i] * a[i] + b[i] * b[i]);
	}
	for (int j = 0;j < n;j++)
	{
		for (int k = 0;k < n;k++)
		{
	if (Math.sqrt((a[j] - a[k]) * (a[j] - a[k]) + (b[j] - b[k]) * (b[j] - b[k])) > max)
	{
	max = Math.sqrt((a[j] - a[k]) * (a[j] - a[k]) + (b[j] - b[k]) * (b[j] - b[k]));
	}
		}
	}
	System.out.printf("%.4lf\n", max);
	}
}

