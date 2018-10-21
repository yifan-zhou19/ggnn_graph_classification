package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int t = 0;
	int j;

	double[] s = new double[300];
	double[] x = new double[300];
	double[] z = new double[300];
	int[] sl = new int[300];


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
			sl[i] = Integer.parseInt(tempVar2);
		}

	}

	s[0] = 2;
	s[1] = 3;
	x[0] = 1;
	x[1] = 2;
	for (i = 0;i < 100;i++)
	{
		s[i + 2] = s[i] + s[i + 1];
		x[i + 2] = x[i] + x[i + 1];
	}
	for (i = 0;i < m;i++)
	{
		z[i] = 0;
	}

	for (i = 0;i < m;i++)
	{
		for (j = 0;j < sl[i];j++)
		{
			z[i] += (s[j] / x[j]);
		}
	}

	for (i = 0;i < m;i++)
	{
		System.out.printf("%.3lf\n",z[i]);
	}

	return 0;
	}
}

