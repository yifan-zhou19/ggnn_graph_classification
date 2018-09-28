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
		int[] xf = new int[100];
		int[] cj = new int[100];
		double[] jd = new double[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		int fz = 0;
		for (i = 0;i < n;i++)
		{
			fz += xf[i];
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
				jd[i] = 4.0 * xf[i];
			}
			else if (cj[i] <= 89 && cj[i] >= 85)
			{
				jd[i] = 3.7 * xf[i];
			}
			else if (cj[i] <= 84 && cj[i] >= 82)
			{
				jd[i] = 3.3 * xf[i];
			}
			else if (cj[i] <= 81 && cj[i] >= 78)
			{
				jd[i] = 3.0 * xf[i];
			}
			else if (cj[i] <= 77 && cj[i] >= 75)
			{
				jd[i] = 2.7 * xf[i];
			}
			else if (cj[i] <= 74 && cj[i] >= 72)
			{
				jd[i] = 2.3 * xf[i];
			}
			else if (cj[i] <= 71 && cj[i] >= 68)
			{
				jd[i] = 2.0 * xf[i];
			}
			else if (cj[i] <= 67 && cj[i] >= 64)
			{
				jd[i] = 1.5 * xf[i];
			}
			else if (cj[i] <= 63 && cj[i] >= 60)
			{
				jd[i] = 1.0 * xf[i];
			}
			else if (cj[i] <= 60)
			{
				jd[i] = 0;
			}
		}
		double z = 0;
		for (i = 0;i < n;i++)
		{
			z += jd[i];
		}
		System.out.printf("%.2lf",z / fz);
		return 0;
	}

}

