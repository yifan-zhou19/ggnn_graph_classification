package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] k = new int[4];
		int i;
		int j = 0;
		int n;
		int[] a = new int[100];
		double m;
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
			if (a[i] >= 1 && a[i] <= 18)
			{
				k[0]++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				k[1]++;
			}

			if (a[i] >= 36 && a[i] <= 60)
			{
				k[2]++;
			}
			if (a[i] > 60)
			{
				k[3]++;
			}
		}
		m = 100 * (1.0 * k[0] / n);
		System.out.printf("1-18: %.2lf%%\n",m);
		m = 100 * (1.0 * k[1] / n);
		System.out.printf("19-35: %.2lf%%\n",m);
		m = 100 * (1.0 * k[2] / n);
		System.out.printf("36-60: %.2lf%%\n",m);
		m = 100 * (1.0 * k[3] / n);
		System.out.printf("60??: %.2lf%%\n",m);
		return 0;
	}



}

