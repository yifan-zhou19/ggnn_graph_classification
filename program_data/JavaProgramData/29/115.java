package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int n;
	int j;
	int t;
	int p = 2;
	int q = 1;
	double sum = 0.000;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (j = 1;j <= n;j++)
	{
	sum += p * 1.000 / q;
	t = q;
	q = p;
	p = q + t;
	if (j == n)
	{
		continue;
	}
	}
	System.out.printf("%.3lf\n",sum);
	sum = 0.000;
	p = 2;
	q = 1;
	}
	return 0;
	}
}

