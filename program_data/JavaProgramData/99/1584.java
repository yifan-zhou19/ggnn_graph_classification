package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		int j;
		double k;
		double p;
		double q;
		double m;
		double s;
		double a;
		double b;
		double c;
		double d;
		a = b = c = d = 0;

		k = p = q = m = s = 0;
		for (j = 0;j < n;j++)
		{
			if (sz[j] <= 18)
			{
				k += 1.0;
			}
			else if (sz[j] >= 19 && sz[j] <= 35)
			{
				p += 1.0;
			}
			else if (sz[j] >= 36 && sz[j] <= 60)
			{
				q += 1.0;
			}
			else if (sz[j] >= 61)
			{
				m += 1.0;
			}


		}
		s = p + q + m + k;
		a = k / s * 100;
		b = p / s * 100;
		c = q / s * 100;
		d = m / s * 100;

		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);


		return 0;
	}


}

