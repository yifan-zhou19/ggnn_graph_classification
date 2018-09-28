package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double x;
		double y;
		double z;
		double q;
		double m;
		double l;
		double e;
		double f;
		int[] sz = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] >= 1 && sz[i] <= 18)
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
			if (sz[i] > 60)
			{
				d += 1;
			}
		}
		x = (double)a / n;
		m = x * 100;
		y = (double)b / n;
		l = y * 100;
		z = (double)c / n;
		e = z * 100;
		q = (double)d / n;
		f = q * 100;
		System.out.printf("1-18: %.2lf%%\n",m);
		System.out.printf("19-35: %.2lf%%\n",l);
		System.out.printf("36-60: %.2lf%%\n",e);
		System.out.printf("60??: %.2lf%%\n",f);
		return 0;
	}


}

