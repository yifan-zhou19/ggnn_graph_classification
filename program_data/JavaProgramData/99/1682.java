package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double a1;
		double b1;
		double c1;
		double d1;
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
				a++;
			}
			if (sz[i] <= 35 && sz[i] >= 19)
			{
				b++;
			}
			if (sz[i] <= 60 && sz[i] >= 36)
			{
				c++;
			}
			if (sz[i] > 60)
			{
				d++;
			}
		}
		a1 = (a * 1.0 / n * 1.0) * 100;
		b1 = (b * 1.0 / n * 1.0) * 100;
		c1 = (c * 1.0 / n * 1.0) * 100;
		d1 = (d * 1.0 / n * 1.0) * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",a1,b1,c1,d1);
		return 0;
	}
}

