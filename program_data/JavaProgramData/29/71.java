package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] sl = new double[10000];
		double he = 0;
		int m;
		int i;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		sl[0] = 2 * 1.0 / 1;
		for (i = 0;i < 9999;i++)
		{
		sl[i + 1] = 1 + 1 * 1.0 / sl[i];
		}
	for (i = 0;i < m;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < n;j++)
		{
		   he += sl[j];
		}
		System.out.printf("%.3lf\n",he);
	he = 0;
	}
	return 0;
	}














































































































}

