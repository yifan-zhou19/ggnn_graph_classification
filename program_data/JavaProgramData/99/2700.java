package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int x = 0;
		int y = 0;
		int z = 0;
		int w = 0;
		double b;
		double c;
		double d;
		double e;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a <= 18)
			{
			   x++;
			}
			else if (a >= 19 && a <= 35)
			{
				y++;
			}
			else if (a >= 36 && a <= 60)
			{
				z++;
			}
			else if (a >= 61)
			{
				w++;
			}
		}
		b = 100 * 1.0 * x / n;
		c = 100 * 1.0 * y / n;
		d = 100 * 1.0 * z / n;
		e = 100 * 1.0 * w / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",b,c,d,e);
		return 0;
	}
}

