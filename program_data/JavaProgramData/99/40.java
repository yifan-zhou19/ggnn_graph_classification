package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double[] b = new double[4];
		double[] c = new double[4];
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
			if (a[i] <= 18)
			{
				c[0]++;
			}
			else if (a[i] > 18 && a[i] <= 35)
			{
				c[1]++;
			}
			else if (a[i] > 35 && a[i] <= 60)
			{
				c[2]++;
			}
			else
			{
				c[3]++;
			}
		}
		m = n;
		for (i = 0;i < n;i++)
		{
			b[i] = c[i] * 100 / m;
		}
		System.out.printf("1-18: %.2lf%%\n",b[0]);
		System.out.printf("19-35: %.2lf%%\n",b[1]);
		System.out.printf("36-60: %.2lf%%\n",b[2]);
		System.out.printf("60??: %.2lf%%",b[3]);
	}

}

