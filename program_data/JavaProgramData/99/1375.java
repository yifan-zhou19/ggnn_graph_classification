package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double l;
		double m;
		double q;
		double p;
	double g = 0;
	double s = 0;
	double b = 0;
	double c = 0;
		int n;
		int i;
		int[] a = new int[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
		if (a[i] >= 1 && a[i] <= 18)
		{
			s = s + 1;
		}
		if (a[i] >= 19 && a[i] <= 35)
		{
			g = g + 1;
		}
		if (a[i] >= 36 && a[i] <= 60)
		{
			b = b + 1;
		}
		if (a[i] >= 61)
		{
			c = c + 1;
		}
		}
		m = (g * 100) / n;
		l = (s * 100) / n;
		q = (b * 100) / n;
		p = (c * 100) / n;
			System.out.printf("1-18: %.2lf%%\n",l);
				System.out.printf("19-35: %.2lf%%\n",m);
				System.out.printf("36-60: %.2lf%%\n",q);
	System.out.printf("60??: %.2lf%%\n",p);

	return 0;

	}
}

