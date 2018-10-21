package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int m = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double q1;
		double q2;
		double q3;
		double q4;
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
			if (a[i] <= 18 && a[i]>0)
			{
				 m += 1;
			}
			if (a[i] <= 35 && a[i] >= 19)
			{
				b += 1;
			}
			if (a[i] <= 60 && a[i] >= 36)
			{
				c += 1;
			}
			if (a[i] > 60)
			{
				d += 1;
			}
		}
		q1 = (double)100 * m / n;
		q2 = (double)100 * b / n;
		q3 = (double)100 * c / n;
		q4 = (double)100 * d / n;
		System.out.printf("1-18: %.2lf%%\n",q1);
		System.out.printf("19-35: %.2lf%%\n",q2);
		System.out.printf("36-60: %.2lf%%\n",q3);
		System.out.printf("60??: %.2lf%%\n",q4);
		return 0;
	}
}

