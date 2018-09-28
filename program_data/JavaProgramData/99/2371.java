package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[4];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				b[0]++;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				b[1]++;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				b[2]++;
			}
			else if (a[i] >= 61)
			{
				b[3]++;
			}
		}
		double[] c = new double[4];
		for (i = 0;i < 4;i++)
		{
			c[i] = (double)b[i] / n;
		}
		System.out.printf("1-18: %.2lf%%\n",c[0] * 100);
		System.out.printf("19-35: %.2lf%%\n",c[1] * 100);
		System.out.printf("36-60: %.2lf%%\n",c[2] * 100);
		System.out.printf("60??: %.2lf%%\n",c[3] * 100);
		return 0;
	}
}

