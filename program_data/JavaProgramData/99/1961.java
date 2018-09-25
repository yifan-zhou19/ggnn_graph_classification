package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double o;
		double p;
		double q;
		double r;
		int[] nl = new int[101];
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
				nl[i] = Integer.parseInt(tempVar2);
			}
			if (nl[i] <= 18)
			{
				a++;
			}
			else if (nl[i] >= 19 && nl[i] <= 35)
			{
				b++;
			}
			else if (nl[i] >= 36 && nl[i] <= 60)
			{
				c++;
			}
			else if (nl[i] >= 61)
			{
				d++;
			}
		}
		o = 1.0 * a / n * 100;
		p = 1.0 * b / n * 100;
		q = 1.0 * c / n * 100;
		r = 1.0 * d / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",o,p,q,r);
		return 0;
	}


}

