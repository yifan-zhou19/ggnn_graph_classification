package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int k;
	int[] n = new int[100];
	double[] sum = new double[100];
	double a = 2;
	double b = 1;
	double c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n[i] = Integer.parseInt(tempVar2);
	}
	a = 2;
	b = 1;
	for (k = 0;k < n[i];k++)
	{
	sum[i] += (a / b);
	c = a;
	a = a + b;
	b = c;
	}
	}
	for (i = 0;i < m;i++)
	{
	System.out.printf("%.3lf\n",sum[i]);
	}

	return 0;
	}
}

