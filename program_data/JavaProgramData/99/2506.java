package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				b = b + 1;
			}
			else if (a[i] > 18 && a[i] <= 35)
			{
				c = c + 1;
			}
			else if (a[i] > 35 && a[i] <= 60)
			{
				d = d + 1;
			}
			else
			{
				e = e + 1;
			}
		}
		b = (b / n) * 100;
		c = (c / n) * 100;
		d = (d / n) * 100;
		e = (e / n) * 100;
		System.out.printf("1-18: %.2lf%%\n",b);
		System.out.printf("19-35: %.2lf%%\n",c);
		System.out.printf("36-60: %.2lf%%\n",d);
		System.out.printf("60??: %.2lf%%\n",e);
	}
}

