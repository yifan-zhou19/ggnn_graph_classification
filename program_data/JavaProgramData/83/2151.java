package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xf = new int[10];
		int[] cj = new int[10];
		double[] gd = new double[10];
		int i;
		int n;
		double GPA;
		double zgd = 0;
		double zxf = 0;

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
				(xf[i]) = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(cj[i]) = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (cj[i] >= 90 && cj[i] <= 100)
			{
				gd[i] = 4.0 * xf[i];
			}
			else if (cj[i] >= 85 && cj[i] <= 89)
			{
				gd[i] = 3.7 * xf[i];
			}
			else if (cj[i] >= 82 && cj[i] <= 84)
			{
				gd[i] = 3.3 * xf[i];
			}
			else if (cj[i] >= 78 && cj[i] <= 81)
			{
				gd[i] = 3.0 * xf[i];
			}
			else if (cj[i] >= 75 && cj[i] <= 77)
			{
				gd[i] = 2.7 * xf[i];
			}
			else if (cj[i] >= 72 && cj[i] <= 74)
			{
				gd[i] = 2.3 * xf[i];
			}
			else if (cj[i] >= 68 && cj[i] <= 71)
			{
				gd[i] = 2.0 * xf[i];
			}
			else if (cj[i] >= 64 && cj[i] <= 67)
			{
				gd[i] = 1.5 * xf[i];
			}
			else if (cj[i] >= 60 && cj[i] <= 63)
			{
				gd[i] = 1.0 * xf[i];
			}
			else
			{
				gd[i] = 0.0;
			}
		}

		for (i = 0;i < n;i++)
		{
			zxf += 1.0 * xf[i];
		}

		for (i = 0;i < n;i++)
		{
			zgd += gd[i];
		}

		GPA = zgd / zxf;

		System.out.printf("%.2lf",GPA);

		return 0;

	}
}

