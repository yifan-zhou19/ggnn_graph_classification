package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int i;
		double o;
		double p;
		double q;
		double s;
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
			if (a[i] > 0 && a[i] < 19)
			{
				b = b + 1;
			}
			else if (a[i] > 18 && a[i] < 36)
			{
				c = c + 1;
			}
			else if (a[i] > 35 && a[i] < 61)
			{
				d = d + 1;
			}
			else
			{
				e = e+1;
			}
		}
		o = (double)b / n * 100;
		p = (double)c / n * 100;
		q = (double)d / n * 100;
		s = (double)e / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",o,p,q,s);
		return 0;
	}
}

