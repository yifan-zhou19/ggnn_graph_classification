package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double s;
		double[] c = new double[10];
		double m = 0;
		double j = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			j = j + a[i];
		}
		for (int t = 0;t < n;t++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[t] = Integer.parseInt(tempVar3);
			}
			if (b[t] >= 90)
			{
				c[t] = 4.0 * (a[t]);
			}
			else if (b[t] >= 85)
			{
				c[t] = 3.7 * (a[t]);
			}
			else if (b[t] >= 82)
			{
				c[t] = 3.3 * (a[t]);
			}
			else if (b[t] >= 78)
			{
				c[t] = 3.0 * (a[t]);
			}
			else if (b[t] >= 75)
			{
				c[t] = 2.7 * a[t];
			}
			else if (b[t] >= 72)
			{
				c[t] = 2.3 * a[t];
			}
			else if (b[t] >= 68)
			{
				c[t] = 2.0 * a[t];
			}
			else if (b[t] >= 64)
			{
				c[t] = 1.5 * a[t];
			}
			else if (b[t] >= 60)
			{
				c[t] = 1.0 * a[t];
			}
			else
			{
				c[t] = 0;
			}
			m = m + c[t];


		}
		s = m / j;
		System.out.printf("%.2lf",s);

		return 0;
	}

}

