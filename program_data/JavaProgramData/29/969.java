package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int m;
	int j;
	int n;
	int[] a = new int[500];
	int[] b = new int[500];
	double sum;
	double[] c = new double[500];
	a[0] = 2;
	b[0] = 1;
	for (i = 1;i < 500;i++)
	{
		a[i] = a[i - 1] + b[i - 1];
		b[i] = a[i - 1];
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	sum = 0.0;
	for (i = 0;i < m;i++)
	{
		sum = 0.0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (n == 1)
		{
			sum = 1.0 * 2;
		}
		else
		{
		for (j = 0;j < n;j++)
		{
			sum += 1.0 * a[j] / b[j];
		}
		}
		c[i] = sum;
	}
	for (i = 0;i < m;i++)
	{
		if (i == m - 1)
		{
			System.out.printf("%.3lf",c[i]);
		}
		else
		{
			System.out.printf("%.3lf\n",c[i]);
		}
	}
	return 0;
	}
}

