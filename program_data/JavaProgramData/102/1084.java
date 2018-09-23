package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] xb = new char[40][8];
		double[] sg = new double[40];
		double[] sz = new double[40];
		double[] ns = new double[40];
		int i;
		int n;
		int k = 0;
		int j = 0;
		int t;
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
				xb[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sg[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (xb[i][0] == 'm')
			{
				sz[k] = sg[i];
				k++;
			}
			else
			{
				ns[j] = sg[i];
				j++;
			}
		}
		for (t = 1;t <= k;t++)
		{
			double e;
			for (i = 0;i < k - t;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
		System.out.printf("%.2lf",sz[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(" %.2lf",sz[i]);
		}
		for (t = 1;t <= j;t++)
		{
			double e;
			for (i = 0;i < j - t;i++)
			{
				if (ns[i] < ns[i + 1])
				{
					e = ns[i + 1];
					ns[i + 1] = ns[i];
					ns[i] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf(" %.2lf",ns[i]);
		}
		return 0;
	}

}

