package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] nianlin = new int[100];
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
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nianlin[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (nianlin[i] <= 18 && nianlin[i] >= 1)
			{
				a += 1;
			}
			if (nianlin[i] <= 35 && nianlin[i] >= 19)
			{
				b += 1;
			}
			if (nianlin[i] <= 60 && nianlin[i] >= 36)
			{
				c += 1;
			}
			if (nianlin[i] >= 61)
			{
				d += 1;
			}
		}
		e = a * 1.0 / n * 100;
		f = b * 1.0 / n * 100;
		g = c * 1.0 / n * 100;
		h = d * 1.0 / n * 100;
		System.out.printf("1-18: %.2lf%%\n",e);
		System.out.printf("19-35: %.2lf%%\n",f);
		System.out.printf("36-60: %.2lf%%\n",g);
		System.out.printf("60??: %.2lf%%\n",h);
		return 0;
	}

}

