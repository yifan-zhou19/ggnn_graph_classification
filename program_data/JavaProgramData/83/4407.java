package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static double[] g = new double[10000];
	public static double GPA(int c)
	{
		if (c >= 90 && c <= 100)
		{
			return 4.0;
		}
		else if (c >= 85 && c <= 89)
		{
			return 3.7;
		}
		else if (c >= 82 && c <= 84)
		{
			return 3.3;
		}
		else if (c >= 78 && c <= 81)
		{
			return 3.0;
		}
		else if (c >= 75 && c <= 77)
		{
			return 2.7;
		}
		else if (c >= 72 && c <= 74)
		{
			return 2.3;
		}
		else if (c >= 68 && c <= 71)
		{
			return 2.0;
		}
		else if (c >= 64 && c <= 67)
		{
			return 1.5;
		}
		else if (c >= 60 && c <= 63)
		{
			return 1.0;
		}
		else if (c < 60)
		{
			return 0.0;
		}
	}
	public static void average(int n)
	{
		double sum1 = 0;
		double aver;
		int sum2 = 0;
		for (int i4 = 0;i4 < n;i4++)
		{
			sum1 += g[i4] * b[i4];
			sum2 += b[i4];
		}
		aver = sum1 / sum2;
		System.out.printf("%.2lf\n",aver);
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i1 = 0;i1 < n;i1++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(b[i1]) = Integer.parseInt(tempVar2);
			}
		}
		for (int i2 = 0;i2 < n;i2++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a[i2]) = Integer.parseInt(tempVar3);
			}
		}
		for (int i3 = 0;i3 < n;i3++)
		{
			g[i3] = GPA(a[i3]);
		}
		average(n);
		return 0;
	}
}

