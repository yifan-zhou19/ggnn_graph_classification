package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] m = new int[100];
	int j;
	double sum = 0;
	double a = 0;
	double sum2 = 0;
	double[] result = new double[100];
	double[] sz = new double[100];
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
			m[i] = Integer.parseInt(tempVar2);
		}
	for (j = 0;j < m[i];j++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[j] = Double.parseDouble(tempVar3);
		}
	}
	sum = 0;
	sum2 = 0;
	for (j = 0;j < m[i];j++)
	{
		sum += sz[j];
	}
	a = sum / (m[i] * 1.0);
	for (j = 0;j < m[i];j++)
	{
		sum2 += (sz[j] - a) * (sz[j] - a);
	}
	result[i] = Math.sqrt(sum2 / (m[i] * 1.0));
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%.5lf\n",result[i]);
	}
	return 0;

	}
}

