package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double h;
		double p;
		double j;
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a <= 18)
			{
				b += 1;
			}
			else if (19 <= a != 0 && a <= 35)
			{
				c += 1;
			}
			else if (36 <= a != 0 && a <= 60)
			{
				d += 1;
			}
			else
			{
				e += 1;
			}
		}
		h = 100.0 * b / n;
		p = 100.0 * c / n;
		j = 100.0 * d / n;
		k = 100.0 * e / n;
		System.out.printf("1-18: %.2lf%%\n",h);
		System.out.printf("19-35: %.2lf%%\n",p);
		System.out.printf("36-60: %.2lf%%\n",j);
		System.out.printf("Over60: %.2lf%%\n",k);
		return 0;
	}



}

