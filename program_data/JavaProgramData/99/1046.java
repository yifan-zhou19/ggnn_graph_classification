package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int m;
		int i;
		double o;
		double p;
		double q;
		double r;
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
				m = Integer.parseInt(tempVar2);
			}
			if ((m <= 18) && (m >= 1))
			{
				a += 1;
			}
			else if ((m >= 19) && (m <= 35))
			{
				b += 1;
			}
			else if ((m >= 36) && (m <= 60))
			{
				c += 1;
			}
			else
			{
				d += 1;
			}
		}
		o = 1.0 * a * 100 / n;
		p = 1.0 * b * 100 / n;
		q = 1.0 * c * 100 / n;
		r = 1.0 * d * 100 / n;
			System.out.print("1-18: ");
			System.out.printf("%.2lf%%\n",o);
			System.out.print("19-35: ");
			System.out.printf("%.2lf%%\n",p);
			System.out.print("36-60: ");
			System.out.printf("%.2lf%%\n",q);
			System.out.print("60??: ");
			System.out.printf("%.2lf%%\n",r);
			return 0;
	}
}

