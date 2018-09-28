package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double e;
		double f;
		double g;
		double h;
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
			if (m <= 18)
			{
				a++;
			}
			else if (m > 18 && m <= 35)
			{
				b++;
			}
			else if (m > 35 && m <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		e = a * 1.0 * 100 / n;
		f = b * 1.0 * 100 / n;
		g = c * 1.0 * 100 / n;
		h = d * 1.0 * 100 / n;
		System.out.print("1-18: ");
		System.out.printf("%.2lf%%\n",e);
		System.out.print("19-35: ");
		System.out.printf("%.2lf%%\n",f);
		System.out.print("36-60: ");
		System.out.printf("%.2lf%%\n",g);
		System.out.print("Over60: ");
		System.out.printf("%.2lf%%\n",h);
		return 0;
	}





}

