package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= a;i++)
	{
	double b;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Double.parseDouble(tempVar2);
	}
	double[] sz = new double[100];
	double n = 0;
	for (int m = 1;m <= b;m++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[m]) = Double.parseDouble(tempVar3);
	}
	n += sz[m] / b;
	}
	double sum = 0;
	for (int k = 1;k <= b;k++)
	{
	sum += (sz[k] - n) * (sz[k] - n);
	}
	double S;
	S = Math.sqrt(sum / b);
	System.out.printf("%.5lf\n",S);
	}
	return 0;
	}
}

