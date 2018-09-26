package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int p;
		int q;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		double[] sz = new double[1000];
		sz[0] = 1;
		sz[1] = 2;
		for (p = 2;p < 1000;p++)
		{
			sz[p] = sz[p - 1] + sz[p - 2];
		}
		double[] s = new double[100];
		for (p = 1;p <= m;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (q = 0;q < n;q++)
			{
				sum += sz[q + 1] / sz[q];
			}
			s[p] = sum;
		}
		for (p = 1;p <= m;p++)
		{
			System.out.printf("%.3lf\n",s[p]);
		}


		return 0;

	}
}

