package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int k;
		int[] b = new int[4];
		double[] c = new double[4];
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
				b[0]++;
			}
			if (a[i] > 18 && a[i] < 36)
			{
				b[1]++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				b[2]++;
			}
			if (a[i] > 60)
			{
				b[3]++;
			}
		}
		for (k = 0;k < 4;k++)
		{
			c[k] = b[k] * 100.0 / n;
		}
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",c[0],c[1],c[2],c[3]);
		return 0;
	}
}

