package <missing>;

public class GlobalMembers
{
	public static double fun(int m)
	{
	int g;
	double sum = 0.0;
	int[] k = new int[1000];
	int[] p = new int[1000];
	k[0] = 2;
	p[0] = 1;
	for (g = 1;g < 1000;g++)
	{
	k[g] = k[g - 1] + p[g - 1];

	p[g] = k[g - 1];
	}
	for (g = 0;g < m;g++)
	{
	sum += 1.0 * k[g] / p[g];

	}
	return sum;
	}



	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
	double x;
	double e;
	double f;
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
		j = Integer.parseInt(tempVar2);
	}
	System.out.printf("%.3lf\n",fun(j));
	}

		return 0;
	}

}

