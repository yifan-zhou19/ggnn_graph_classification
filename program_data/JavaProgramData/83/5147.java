package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xf = new int[m];
		int[] fs = new int[m];
		double[] xfj = new double[m];
		double[] jd = new double[m];
		int n;
		int i;
		double gpa;
		double zf;
		double zj;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				fs[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (fs[i] <= 100 && fs[i] >= 90)
			{
				jd[i] = 4.0;
			}
			else if (fs[i] >= 85)
			{
				jd[i] = 3.7;
			}
			else if (fs[i] >= 82)
			{
				jd[i] = 3.3;
			}
			else if (fs[i] >= 78)
			{
				jd[i] = 3.0;
			}
			else if (fs[i] >= 75)
			{
				jd[i] = 2.7;
			}
			else if (fs[i] >= 72)
			{
				jd[i] = 2.3;
			}
			else if (fs[i] >= 68)
			{
				jd[i] = 2.0;
			}
			else if (fs[i] >= 64)
			{
				jd[i] = 1.5;
			}
			else if (fs[i] >= 60)
			{
				jd[i] = 1.0;
			}
			else
			{
				jd[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			xfj[i] = jd[i] * xf[i];
		}
		zf = 0;
		for (i = 0;i < n;i++)
		{
			zf += xf[i];
		}
		zj = 0;
		for (i = 0;i < n;i++)
		{
			zj += xfj[i];
		}
		gpa = zj / zf;
		System.out.printf("%.2lf",gpa);

		return 0;
	}
}

