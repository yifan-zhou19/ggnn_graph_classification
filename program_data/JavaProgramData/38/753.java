package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int i;
	int b;
	int j;
	double sum = 0;
	double l = 0;
	double[] sz = new double[100];
	double s;
	double k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (i = 0;i < a;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (j = 0;j < b;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[j]) = Double.parseDouble(tempVar3);
	}
	}
	for (j = 0;j < b;j++)
	{
	sum += sz[j];
	}
	k = sum / b;
	for (j = 0;j < b;j++)
	{
	l += (sz[j] - k) * (sz[j] - k);
	}
	s = Math.sqrt(l / b);

		System.out.printf("%.5lf\n",s);
	sum = 0;
	l = 0;
	}
	return 0;
	}
}

