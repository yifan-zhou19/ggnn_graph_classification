package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] a = new int[10000];
		double[] s = new double[10000];
		double[] sz = new double[10000];
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			s[i] = 0;
			 for (j = 2;j <= a[i] + 1;j++)
			 {
				sz[0] = 1;
				sz[1] = 2;
				sz[j] = sz[j - 1] + sz[j - 2];
				s[i] += sz[j - 1] * 1.0 / sz[j - 2];
			 }
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",s[i]);
		}
		return 0;
	}

}

