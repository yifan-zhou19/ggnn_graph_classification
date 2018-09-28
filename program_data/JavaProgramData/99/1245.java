package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] y = new int[q];
		int[] a = new int[p];
		int i;
		int j;
		int s;
		double[] b = new double[p];
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
				y[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < p;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] <= 18)
			{
				a[0] = a[0] + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] > 18 && y[i] < 36)
			{
				a[1] = a[1] + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] <= 60 && y[i]>35)
			{
				a[2] = a[2] + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] > 60)
			{
				a[3] = a[3] + 1;
			}
		}
		for (i = 0;i < p;i++)
		{
			b[i] = 1.0 * a[i] / n;
		}
		for (i = 0;i < p;i++)
		{
			b[i] = 100 * b[i];
		}


		System.out.print("1-18: ");
		System.out.printf("%.2lf%%\n",b[0]);
		System.out.printf("19-35: %.2lf%%\n",b[1]);
		System.out.printf("36-60: %.2lf%%\n",b[2]);
		System.out.print("Over60: ");
		System.out.printf("%.2lf%%",b[3]);
		return 0;
	}





}

