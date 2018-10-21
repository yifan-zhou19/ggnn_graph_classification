package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] m = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double q;
		double w;
		double e;
		double r;
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
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] <= 18)
			{
				a++;
			}
			else
			{
				if (m[i] <= 35)
				{
					b++;
				}
		else if (m[i] <= 60)
		{
			c++;
		}
		else
		{
			d++;
		}
			}
		}
		q = (double)a / (double)n * 100;
		w = (double)b / (double)n * 100;
		e = (double)c / (double)n * 100;
		 r = (double)d / (double)n * 100;
		 System.out.printf("1-18: %.2lf%%\n",q);
	System.out.printf("19-35: %.2lf%%\n",w);
	System.out.printf("36-60: %.2lf%%\n",e);
	System.out.printf("60??: %.2lf%%",r);
	return 0;
	}
}

