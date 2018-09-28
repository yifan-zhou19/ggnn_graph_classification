package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		int n;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int i;
		int[] sz = new int[100];
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
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				e += 1;
			}
			else if (sz[i] > 18 && sz[i] <= 35)
			{
				f += 1;
			}
			else if (sz[i] > 35 && sz[i] <= 60)
			{
				g += 1;
			}
			else if (sz[i] > 60)
			{
				h += 1;
			}
		}
		a = 100.0 * e / n;
		b = 100.0 * f / n;
		c = 100.0 * g / n;
		d = 100.0 * h / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",a,b,c,d);
		return 0;
	}


}

