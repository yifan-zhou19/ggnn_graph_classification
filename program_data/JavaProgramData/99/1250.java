package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10000];
		int k = 0;
		int l = 0;
		int m = 0;
		int q = 0;
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
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				k += 1;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				l += 1;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				m += 1;
			}
			if (a[i] > 60)
			{
				q += 1;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)100 * k / n);
		System.out.printf("19-35: %.2lf%%\n",(double)100 * l / n);
		System.out.printf("36-60: %.2lf%%\n",(double)100 * m / n);
		System.out.printf("Over60: %.2lf%%\n",(double)100 * q / n);
		return 0;
	}

}

