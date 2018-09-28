package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int n;
		int k;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			if (k >= 1 && k <= 18)
			{
				a++;
			}
			if (k >= 19 && k <= 35)
			{
				b++;
			}
			if (k >= 36 && k <= 60)
			{
				c++;
			}
			if (k >= 61)
			{
				d++;
			}
			i++;
		}
		System.out.printf("1-18: %.2lf%%\n",(double)a * 100 / (double)n);
		System.out.printf("19-35: %.2lf%%\n",(double)b * 100 / (double)n);
		System.out.printf("36-60: %.2lf%%\n",(double)c * 100 / (double)n);
		System.out.printf("60??: %.2lf%%\n",(double)d * 100 / (double)n);
	}
}

