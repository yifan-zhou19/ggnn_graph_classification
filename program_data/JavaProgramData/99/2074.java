package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int b;
		int c;
		int d;
		int e;
		int[] a = new int[100];
		double w;
		double x;
		double y;
		double z;
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
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				b = b + 1;
			}
			else if (a[i]<36 & a[i]>18)
			{
				c = c + 1;
			}
			else if (a[i]<61 & a[i]>35)
			{
				d = d + 1;
			}
			else
			{
				e = e+1;
			}
		}
		w = (double)b * 100 / n;
		x = (double)c * 100 / n;
		y = (double)d * 100 / n;
		z = (double)e * 100 / n;
		System.out.printf("1-18: %.2lf%%\n",w);
		System.out.printf("19-35: %.2lf%%\n",x);
		System.out.printf("36-60: %.2lf%%\n",y);
		System.out.printf("60??: %.2lf%%",z);
	}
}

