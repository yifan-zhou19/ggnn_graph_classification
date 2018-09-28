package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] a = new int[n];
		int[] c = new int[n];
		double[] b = new double[n];
		double[] d = new double[n];
		double m;
		double f;
		double s;
		m = f = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 100 && a[i] >= 90)
			{
				b[i] = 4.0;
			}
			if (a[i] <= 89 && a[i] >= 85)
			{
				b[i] = 3.7;
			}
			if (a[i] <= 84 && a[i] >= 82)
			{
				b[i] = 3.3;
			}
			if (a[i] <= 81 && a[i] >= 78)
			{
				b[i] = 3.0;
			}
			if (a[i] <= 77 && a[i] >= 75)
			{
				b[i] = 2.7;
			}
			if (a[i] <= 74 && a[i] >= 72)
			{
				b[i] = 2.3;
			}
			if (a[i] <= 71 && a[i] >= 68)
			{
				b[i] = 2.0;
			}
			if (a[i] <= 67 && a[i] >= 64)
			{
				b[i] = 1.5;
			}
			if (a[i] <= 63 && a[i] >= 60)
			{
				b[i] = 1;
			}
			if (a[i] <= 59)
			{
				b[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			d[i] = b[i] * c[i];
		}
		for (i = 0;i < n;i++)
		{
			m = m + d[i];
			f = f + c[i];
		}
		s = m / f;
		System.out.printf("%.2lf",s);
		return 0;
	}



}

