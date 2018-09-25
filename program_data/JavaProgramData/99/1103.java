package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
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
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(a[i]) = Integer.parseInt(tempVar2);
		}
		if (a[i] <= 18)
		{
			x++;
		}
		else if (a[i] > 18 && a[i] <= 35)
		{
				y++;
		}
			else if (a[i] > 35 && a[i] <= 60)
			{
			z++;
			}
			else
			{
				w++;
			}
		}
		b = 100.0 * x / n;
		c = 100.0 * y / n;
		d = 100.0 * z / n;
		e = 100.0 * w / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\nOver60: %.2lf%%",b,c,d,e);
		return 0;
	}




}

