package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int i;
		double a;
		double b;
		double c;
		double d;
		double e = 0;
		double f = 0;
		double g = 0;
		double h = 0;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
				e++;
			}
			else if (sz[i] <= 35)
			{
				f++;
			}
			else if (sz[i] <= 60)
			{
				g++;
			}
			else
			{
				h++;
			}
		}
		a = 100 * e / n;
		b = 100 * f / n;
		c = 100 * g / n;
		d = 100 * h / n;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}
}

