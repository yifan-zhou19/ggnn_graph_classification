package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		double x1 = 0.0;
		double x2 = 0.0;
		double x3 = 0.0;
		double x4 = 0.0;
		double c1;
		double c2;
		double c3;
		double c4;
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
			if (a[i] > 60)
			{
				x4++;
			}
			else if (a[i] > 35)
			{
				x3++;
			}
			else if (a[i] > 18)
			{
				x2++;
			}
			else
			{
				x1++;
			}
		}
		c1 = (x1 / n) * 100;
		c2 = (x2 / n) * 100;
		c3 = (x3 / n) * 100;
		c4 = (x4 / n) * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",c1,c2,c3,c4);
		return 0;
	}

}

