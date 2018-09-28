package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		double p;
		double q;
		double r;
		double s;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
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
				b++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (19 <= a[i] != 0 && a[i] <= 35)
			{
				c++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (36 <= a[i] != 0 && a[i] <= 60)
			{
				d++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (61 <= a[i])
			{
				e++;
			}
		}
		p = (b * 1.0 / n) * 100;
		q = (c * 1.0 / n) * 100;
		r = (d * 1.0 / n) * 100;
		s = (e * 1.0 / n) * 100;
		System.out.printf("1-18: %.2lf%%\n",p);
		System.out.printf("19-35: %.2lf%%\n",q);
		System.out.printf("36-60: %.2lf%%\n",r);
		System.out.printf("60??: %.2lf%%\n",s);
	}
}

