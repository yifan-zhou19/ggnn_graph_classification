package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
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
				d1 += 1;
			}
			else if (a[i] <= 35)
			{
				d2++;
			}
			else if (a[i] <= 60)
			{
				d3++;
			}
			else
			{
				d4++;
			}
		}
		double b1;
		double b2;
		double b3;
		double b4;
		b1 = (double)d1 / n;
		b2 = (double)d2 / n;
		b3 = (double)d3 / n;
		b4 = (double)d4 / n;
		System.out.printf("1-18: %.2lf%%\n",b1 * 100);
		System.out.printf("19-35: %.2lf%%\n",b2 * 100);
		System.out.printf("36-60: %.2lf%%\n",b3 * 100);
		System.out.printf("60??: %.2lf%%\n",b4 * 100);
		return 0;
	}
}

