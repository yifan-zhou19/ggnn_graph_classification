package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int[] sz = new int[101];
		double o1;
		double o2;
		double o3;
		double o4;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] <= 18)
			{
				s1 = s1 + 1;
			}
			if (sz[i] >= 19 && sz[i] <= 35)
			{
				s2 = s2 + 1;
			}
			if (sz[i] >= 36 && sz[i] <= 60)
			{
				s3 = s3 + 1;
			}
			if (sz[i] >= 61)
			{
				s4 = s4 + 1;
			}
		}
		o1 = s1 * 1.0 * 100 / n;
		o2 = s2 * 1.0 * 100 / n;
		o3 = s3 * 1.0 * 100 / n;
		o4 = s4 * 1.0 * 100 / n;
		System.out.printf("1-18: %.2lf%%\n",o1);
		System.out.printf("19-35: %.2lf%%\n",o2);
		System.out.printf("36-60: %.2lf%%\n",o3);
		System.out.printf("60??: %.2lf%%",o4);
		return 0;
	}
}

