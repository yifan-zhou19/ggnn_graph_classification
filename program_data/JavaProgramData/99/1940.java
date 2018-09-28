package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double b = 0;
		double c = 0;
		double d = 0;
		double f = 0;
		double g;
		double h;
		double p;
		double q;
		int[] a = new int[1000];
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
			if (a[i] <= 18)
			{
				b += 1;
			}
			else if (a[i] <= 35)
			{
				c += 1;
			}
			else if (a[i] <= 60)
			{
				d += 1;
			}
			else
			{
				f += 1;
			}

		}
		g = b / n * 100;
		h = c / n * 100;
		p = d / n * 100;
		q = f / n * 100;
		System.out.printf("1-18: %.2lf%%\n",g);
		System.out.printf("19-35: %.2lf%%\n",h);
		System.out.printf("36-60: %.2lf%%\n",p);
		System.out.printf("60??: %.2lf%%\n",q);

		return 0;
	}
}

