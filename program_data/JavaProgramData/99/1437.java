package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] a = new int[100];
		double[] b = new double[4];
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
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
				c = c + 1;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				d = d + 1;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				e = e+1;
			}
			if (a[i] >= 61)
			{
				f = f + 1;
			}
		}
		b[0] = ((double)c / n) * 100;
		b[1] = ((double)d / n) * 100;
		b[2] = ((double)e / n) * 100;
		b[3] = ((double)f / n) * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",b[0],b[1],b[2],b[3]);

	}
}

