package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
		double p;
		double q;
		double m;
		double g;
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
				k = Integer.parseInt(tempVar2);
			}
			if (k < 19)
			{
				a = a + 1;
			}
			else if (k > 18 && k < 36)
			{
				b = b + 1;
			}
			else if (k > 35 && k < 61)
			{
				c = c + 1;
			}
			else if (k > 60)
			{
				d = d + 1;
			}
		}
		p = 100 * (double)a / n;
		q = 100 * (double)b / n;
		m = 100 * (double)c / n;
		g = 100 * (double)d / n;
		System.out.printf("1-18: %.2lf%%\n",p);
		System.out.printf("19-35: %.2lf%%\n",q);
		System.out.printf("36-60: %.2lf%%\n",m);
		System.out.printf("60??: %.2lf%%\n",g);
		return 0;
	}




}

