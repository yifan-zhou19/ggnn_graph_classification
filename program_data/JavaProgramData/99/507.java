package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double x;
		double y;
		double z;
		double k;
		double b;
		double c;
		double d;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				b++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				c++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				d++;
			}
			if (a[i] > 60)
			{
				e++;
			}
		}
		x = 100 * b / (b + c + d + e);
		y = 100 * c / (b + c + d + e);
		z = 100 * d / (b + c + d + e);
		k = 100 * e / (b + c + d + e);
		System.out.printf("1-18: %.2lf%%\n",x);
		System.out.printf("19-35: %.2lf%%\n",y);
		System.out.printf("36-60: %.2lf%%\n",z);
		System.out.printf("60??: %.2lf%%\n",k);
		return 0;

	}
}

