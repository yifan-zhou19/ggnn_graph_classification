package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xf = new int[100];
		int[] df = new int[100];
		int xfzh = 0;
		double jdzh = 0.0;
		double[] jd = new double[100];
		double[] xfjd = new double[100];
		double zpjd;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
			xfzh += xf[i];
		}
		for (int a = 0;a < n;a++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[a] = Integer.parseInt(tempVar3);
			}
		}
		for (int b = 0;b < n;b++)
		{
			if (df[b] >= 90 && df[b] <= 100)
			{
				jd[b] = 4.0;
			}
			else if (df[b] >= 85 && df[b] <= 89)
			{
				jd[b] = 3.7;
			}
			else if (df[b] >= 82 && df[b] <= 84)
			{
				jd[b] = 3.3;
			}
			else if (df[b] >= 78 && df[b] <= 81)
			{
				jd[b] = 3.0;
			}
			else if (df[b] >= 75 && df[b] <= 77)
			{
				jd[b] = 2.7;
			}
			else if (df[b] >= 72 && df[b] <= 74)
			{
				jd[b] = 2.3;
			}
			else if (df[b] >= 68 && df[b] <= 71)
			{
				jd[b] = 2.0;
			}
			else if (df[b] >= 64 && df[b] <= 67)
			{
				jd[b] = 1.5;
			}
			else if (df[b] >= 60 && df[b] <= 63)
			{
				jd[b] = 1.0;
			}
			else
			{
				jd[b] = 0.0;
			}
			xfjd[b] = jd[b] * xf[b];
			jdzh += xfjd[b];
		}
		zpjd = jdzh / xfzh;
		System.out.printf("%.2lf\n",zpjd);
		return 0;
	}
}

