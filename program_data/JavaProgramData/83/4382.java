package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] cj = new int[10];
		int[] xf = new int[10];
		int s2 = 0;
		double[] jd = new double[10];
		double[] xfjd = new double[10];
		double s1 = 0.0;
		double gpa;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			xf[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			cj[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (cj[i] >= 90)
			{
			jd[i] = 4.0;
			}
			else if (cj[i] >= 85 && cj[i] <= 89)
			{
			jd[i] = 3.7;
			}
			else if (cj[i] >= 82 && cj[i] <= 84)
			{
			jd[i] = 3.3;
			}
			else if (cj[i] >= 78 && cj[i] <= 81)
			{
			jd[i] = 3.0;
			}
			else if (cj[i] >= 75 && cj[i] <= 77)
			{
			jd[i] = 2.7;
			}
			else if (cj[i] >= 72 && cj[i] <= 74)
			{
			jd[i] = 2.3;
			}
			else if (cj[i] >= 68 && cj[i] <= 71)
			{
			jd[i] = 2.0;
			}
			else if (cj[i] >= 64)
			{
			jd[i] = 1.5;
			}
			else if (cj[i] >= 60)
			{
			jd[i] = 1.0;
			}
			else
			{
			jd[i] = 0.0;
			}

		}
	for (i = 0;i < n;i++)
	{
	xfjd[i] = xf[i] * jd[i];
	s1 = s1 + xfjd[i];
	s2 = s2 + xf[i];
	}
	gpa = s1 / s2;
	System.out.printf("%.2lf",gpa);
	return 0;
	}

}

