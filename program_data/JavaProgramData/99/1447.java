package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int b4 = 0;
		int i;
		double c1;
		double c2;
		double c3;
		double c4;
		c1 = 0.0;
		c2 = 0.0;
		c3 = 0.0;
		c4 = 0.0;
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
				b1++;
			}
			if (a[i] > 18 && a[i] <= 35)
			{
				b2++;
			}
			if (a[i] > 35 && a[i] <= 60)
			{
				b3++;
			}
			if (a[i] > 60)
			{
				b4++;
			}
		}
		c1 = (double)b1 * 100 / n;
		c2 = (double)b2 * 100 / n;
		c3 = (double)b3 * 100 / n;
		c4 = (double)b4 * 100 / n;
		System.out.printf("1-18: %.2lf%%\n",c1);
		System.out.printf("19-35: %.2lf%%\n",c2);
		System.out.printf("36-60: %.2lf%%\n",c3);
		System.out.printf("60??: %.2lf%%\n",c4);
		return 0;
	}
}

