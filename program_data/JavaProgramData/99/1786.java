package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] sz = new int[100];
		double e;
		double r;
		double j;
		double m;
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
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				a = a + 1;
			}
			else if (sz[i] > 18 && sz[i] <= 35)
			{
				b = b + 1;
			}
			else if (sz[i] > 35 && sz[i] <= 60)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1;
			}
		}
		e = a * 1.0 / n;
		r = b * 1.0 / n;
		j = c * 1.0 / n;
		m = d * 1.0 / n;
		System.out.printf("1-18: %.2lf%%\n",e * 100);
		System.out.printf("19-35: %.2lf%%\n",r * 100);
		System.out.printf("36-60: %.2lf%%\n",j * 100);
		System.out.printf("60??: %.2lf%%\n",m * 100);
		return 0;
	}


}

