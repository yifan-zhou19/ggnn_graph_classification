package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		int[] df = new int[100];
		double GPA;
		int[] xf = new int[100];
		double[] jd = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			xf[n - 1] = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				df[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (df[i] < 60)
			{
				jd[i] = 0 * xf[i];
			}
			else if (df[i] >= 60 && df[i] <= 63)
			{
					jd[i] = 1.0 * xf[i];
			}
				else if (df[i] >= 64 && df[i] <= 67)
				{
					jd[i] = 1.5 * xf[i];
				}
					else if (df[i] >= 68 && df[i] <= 71)
					{
						jd[i] = 2.0 * xf[i];
					}
					else if (df[i] >= 72 && df[i] <= 74)
					{
						jd[i] = 2.3 * xf[i];
					}
					else if (df[i] >= 75 && df[i] <= 77)
					{
						jd[i] = 2.7 * xf[i];
					}
					else if (df[i] >= 78 && df[i] <= 81)
					{
						jd[i] = 3.0 * xf[i];
					}
					else if (df[i] >= 82 && df[i] <= 84)
					{
						jd[i] = 3.3 * xf[i];
					}
					else if (df[i] >= 85 && df[i] <= 89)
					{
						jd[i] = 3.7 * xf[i];
					}
					else if (df[i] >= 90 && df[i] <= 100)
					{
						jd[i] = 4.0 * xf[i];
					}
		}
		for (i = 0,a = 0,b = 0;i <= n - 1;i++)
		{
			a += xf[i];
			b += jd[i];
		}
		GPA = b / a;
		System.out.printf("%.2lf",GPA);
		return 0;
	}
}

