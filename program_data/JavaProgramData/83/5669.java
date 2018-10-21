package <missing>;

public class GlobalMembers
{
	public static double zpjd(int n, int[] a, int[] b)
	{
		int i = 0;
		double[] ax = new double[9];
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 100)
			{
				ax[i] = 4.0;
			}
			else if (a[i] >= 85 && a[i] <= 89)
			{
				ax[i] = 3.7;
			}
			else if (a[i] >= 82 && a[i] <= 84)
			{
				ax[i] = 3.3;
			}
			else if (a[i] >= 78 && a[i] <= 81)
			{
				ax[i] = 3.0;
			}
			else if (a[i] >= 75 && a[i] <= 77)
			{
				ax[i] = 2.7;
			}
			else if (a[i] >= 72 && a[i] <= 74)
			{
				ax[i] = 2.3;
			}
			else if (a[i] >= 68 && a[i] <= 71)
			{
				ax[i] = 2.0;
			}
			else if (a[i] >= 64 && a[i] <= 67)
			{
				ax[i] = 1.5;
			}
			else if (a[i] >= 60 && a[i] <= 63)
			{
				ax[i] = 1.0;
			}
			else if (a[i] <= 59)
			{
				ax[i] = 0;
			}
		}
		double s1;
		double s2;
		double c;
		s1 = 0;
		s2 = 0;
		for (i = 0;i < n;i++)
		{
			s1 = s1 + ax[i] * b[i] * 1,0;
		}
		for (i = 0;i < n;i++)
		{
			s2 = s2 + b[i] * 1.0;
		}
		c = s1 / s2 * 1.0;
		return c;
	}
	public static int Main()
	{
		int n;
		int i;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[9];
		int[] b = new int[9];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
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
		c = zpjd(n, a, b);
		System.out.printf("%.2lf",c);
		return 0;
	}

}

