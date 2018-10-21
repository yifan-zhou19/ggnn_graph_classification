package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[101];
		int i;
		int[] aa = new int[4];
		double m;
		double[] b = new double[4];

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
				aa[0]++;
			}
			else if (a[i] <= 35)
			{
				aa[1]++;
			}
			else if (a[i] <= 60)
			{
				aa[2]++;
			}
			else
			{
				aa[3]++;
			}
		}
		m = n;
		for (i = 0;i < 4;i++)
		{
			b[i] = 100 * aa[i] / m;
		}
		System.out.printf("1-18: %.2lf%%\n",b[0]);
		System.out.printf("19-35: %.2lf%%\n",b[1]);
		System.out.printf("36-60: %.2lf%%\n",b[2]);
		System.out.printf("60??: %.2lf%%\n",b[3]);
	}
}

