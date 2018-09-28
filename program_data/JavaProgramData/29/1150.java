package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double e;
		double m;
		int[] sz = new int[100000];
		int[] wt = new int[100000];
		int c;
		int d;
		int n;
		sz[1] = 1;
		sz[2] = 2;
		sz[3] = 3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		for (d = 0;d < m;d++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				wt[d] = Integer.parseInt(tempVar2);
			}
		}
		for (d = 0;d < m;d++)
		{
			if (wt[d] == 1)
			{
				e = 2;
			}
			else if (wt[d] == 2)
			{
				e = 3.500;
			}
			else if (wt[d] >= 3)
			{
				e = 3.500;
				for (c = 3;c <= wt[d];c++)
				{
					sz[c + 1] = sz[c - 1] + sz[c];
					e = e+1.000 * sz[c + 1] / sz[c];
				}
			}
			System.out.printf("%.3lf\n",e);
		}
		return 0;
	}

}

