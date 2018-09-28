package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int n;
		int i;
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
			if (a[i] <= 18)
			{
				s1++;
			}
			if (a[i] > 18 && a[i] <= 35)
			{
				s2++;
			}
			if (a[i] > 35 && a[i] < 61)
			{
				s3++;
			}
			if (a[i] > 60)
			{
				s4++;
			}
		}
		double x;
		double b;
		double c;
		double d;
		x = s1 * 1.0 * 100 / n;
		b = s2 * 1.0 * 100 / n;
		c = s3 * 1.0 * 100 / n;
		d = s4 * 1.0 * 100 / n;
		System.out.printf("1-18: %.2lf%%\n",x);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}
}

