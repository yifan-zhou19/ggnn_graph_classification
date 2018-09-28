package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int[] a = new int[100];
	int[] s = new int[100];
	int i;
	int j;
	double[] b = new double[200];
	double[] c = new double[200];
	double[] d = new double[200];
	double sum = 0;
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
			s[i] = Integer.parseInt(tempVar2);
		}
	}
	b[0] = 2;
	c[0] = 1;
	for (i = 0;i < m;i++)
	{
		for (j = 1;j < s[i];j++)
		{
			b[j] = b[j - 1] + c[j - 1];
			c[j] = b[j - 1];
			d[j] = b[j] / c[j];
			sum += d[j];

		}
	System.out.printf("%.3f\n",sum + 2.0);
	sum = 0;
	}

	return 0;
	}
}

