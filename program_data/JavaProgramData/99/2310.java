package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int i;
		double x;
		double y;
		double z;
		double t;
		double e;
		double f;
		double g;
		double h;
		double m;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
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
			else if (sz[i] > 18 && sz[i] < 36)
			{
				b = b + 1;
			}
			else if (sz[i] > 35 && sz[i] < 61)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1;
			}
		}
		e = a;
		f = b;
		g = c;
		h = d;
		m = n;
		x = e / m;
		y = f / m;
		z = g / m;
		t = h / m;
		System.out.printf("1-18: %.2lf%%\n",x * 100);
		System.out.printf("19-35: %.2lf%%\n",y * 100);
		System.out.printf("36-60: %.2lf%%\n",z * 100);
		System.out.printf("Over60: %.2lf%%\n",t * 100);
		return 0;
	}


}

