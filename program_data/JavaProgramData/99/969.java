package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i;
		double p;
		double q;
		double r;
		double s;
		double e1;
		double e2;
		double e3;
		double e4;
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
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				a++;
			}
			else if ((sz[i] > 18) && (sz[i] <= 35))
			{
				b++;
			}
			else if ((sz[i] > 35) && (sz[i] <= 60))
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		p = a;
		q = b;
		r = c;
		s = d;
		e1 = p / n;
		e2 = q / n;
		e3 = r / n;
		e4 = s / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",e1 * 100,e2 * 100,e3 * 100,e4 * 100);
		return 0;
	}


}

