package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int w;
		int x;
		int y;
		int z;
		w = 0;
		x = 0;
		y = 0;
		z = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				w++;
			}
			else if (a[i] > 18 && a[i] <= 35)
			{
				x++;
			}
			else if (a[i] > 35 && a[i] <= 60)
			{
				y++;
			}
			else
			{
				z++;
			}
		}
		double b;
		double c;
		double d;
		double e;
		b = (double)w / n * 100;
		c = (double)x / n * 100;
		d = (double)y / n * 100;
		e = (double)z / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",b,c,d,e);
		return 0;
	}
}

