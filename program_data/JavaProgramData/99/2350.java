package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] nl = new int[99];
		int n18 = 0;
		int n35 = 0;
		int n60 = 0;
		int n61 = 0;
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
				nl[i] = Integer.parseInt(tempVar2);
			}
			if (nl[i] <= 18)
			{
				n18++;
				continue;
			}
			if (nl[i] <= 35)
			{
				n35++;
				continue;
			}
			if (nl[i] <= 60)
			{
				n60++;
				continue;
			}
			if (nl[i] >= 61)
			{
				n61++;
				continue;
			}
		}
		double a = 100.0 * n18 / n;
		double b = 100.0 * n35 / n;
		double c = 100.0 * n60 / n;
		double d = 100.0 * n61 / n;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}
}

