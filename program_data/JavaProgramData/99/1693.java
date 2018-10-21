package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double e;
		double f;
		double g;
		double h;
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
				a += 1;
			}
			if (sz[i] >= 19 && sz[i] <= 35)
			{
				b += 1;
			}
			if (sz[i] >= 36 && sz[i] <= 60)
			{
				c += 1;
			}
			if (sz[i] >= 61)
			{
				d += 1;
			}
		}
		e = 1.0 * a / n * 100;
		f = 1.0 * b / n * 100;
		g = 1.0 * c / n * 100;
		h = 1.0 * d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",e);
		System.out.printf("19-35: %.2lf%%\n",f);
		System.out.printf("36-60: %.2lf%%\n",g);
		System.out.printf("60??: %.2lf%%\n",h);
		return 0;
	}
}

