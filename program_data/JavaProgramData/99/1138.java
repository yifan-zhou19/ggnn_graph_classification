package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[SIZE];
		double w;
		double a;
		double s;
		double d;
		w = a = s = d = 0;
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
			w += 1;
		}
		else if (sz[i] <= 35)
		{
		  a += 1;
		}
	else if (sz[i] <= 60)
	{
		  s += 1;
	}
	else
	{
		 d += 1;
	}
	}
		w = w * 100 / n;
		a = a * 100 / n;
		s = s * 100 / n;
		d = d * 100 / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\nOver60: %.2lf%%",w,a,s,d);
	 return 0;
	}
}

