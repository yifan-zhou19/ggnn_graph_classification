package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xf = new int[10];
		int[] fs = new int[10];
		double[] jd = new double[10];
		double a = 0;
		double b = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(xf[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(fs[i]) = Integer.parseInt(tempVar3);
			}
		};
		for (i = 0;i < n;i++)
		{
			if (fs[i] <= 100 && fs[i] >= 90)
			{
				jd[i] = 4.0;
			}
			else
			{
					if (fs[i] >= 85)
					{
						jd[i] = 3.7;
					}
				else
				{
					if (fs[i] >= 82)
					{
						jd[i] = 3.3;
					}
				else
				{
					if (fs[i] >= 78)
					{
						jd[i] = 3.0;
					}
				else
				{
					if (fs[i] >= 75)
					{
						jd[i] = 2.7;
					}
				else
				{
					if (fs[i] >= 72)
					{
						jd[i] = 2.3;
					}
				else
				{
					if (fs[i] >= 68)
					{
						jd[i] = 2.0;
					}
				else
				{
					if (fs[i] >= 64)
					{
						jd[i] = 1.5;
					}
				else
				{
					if (fs[i] >= 60)
					{
						jd[i] = 1.0;
					}
				else
				{
							jd[i] = 0;
				}
				}
				}
				}
				}
				}
				}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			a += jd[i] * xf[i];
			b += xf[i];
		}
		GPA = a / b;
		System.out.printf("%.2lf",GPA);





		return 0;
	}

}

