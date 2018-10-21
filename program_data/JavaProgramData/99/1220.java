package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] nl = new int[100];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nl[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (nl[i] <= 18)
			{
				a++;
			}
			if (nl[i] >= 19 && nl[i] <= 35)
			{
				b++;
			}
			if (nl[i] >= 36 && nl[i] <= 60)
			{
				c++;
			}
			if (nl[i] > 60)
			{
				d++;
			}
		}
		double e;
		double f;
		double g;
		double h;
		e = (double)a / n * 100;
		f = (double)b / n * 100;
		g = (double)c / n * 100;
		h = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",e);
		System.out.printf("19-35: %.2lf%%\n",f);
		System.out.printf("36-60: %.2lf%%\n",g);
		System.out.printf("Over60: %.2lf%%",h);
		return 0;

	}
}

