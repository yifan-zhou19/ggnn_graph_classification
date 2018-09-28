package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] sz = new int[100];
		int i;
		int j;
		double a = 1;
		double b = 2;
		double[] sz1 = new double[100];
		double d;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			sz1[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < sz[i];j++)
			{
				sz1[i] += (b / a);
				d = b;
				b += a;
				a = d;
			}
			a = 1;
			b = 2;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sz1[i]);
		}
		return 0;
	}
}

