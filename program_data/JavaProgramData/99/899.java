package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int i;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		double bb;
		double cc;
		double dd;
		double ee;
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
				b++;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				c++;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				d++;
			}
			else
			{
				e++;
			}
		}
		bb = 100.0 * b / n;
		cc = 100.0 * c / n;
		dd = 100.0 * d / n;
		ee = 100.0 * e / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",bb,cc,dd,ee);
		return 0;
	}


}

