package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double s = 0.00;
		double a = 0.00;
		double[][] cj = new double[2][10];
		for (i = 0;i < 2;i++)
		{
			for (e = 0;e < n;e++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					cj[i][e] = Double.parseDouble(tempVar2);
				}
			}
		}
		for (e = 0;e < n;e++)
		{
			if (cj[1][e] >= 90 && cj[1][e] <= 100)
			{
				cj[1][e] = 4.0;
			}
			else if (cj[1][e] >= 85 && cj[1][e] <= 89)
			{
				cj[1][e] = 3.7;
			}
			else if (cj[1][e] >= 82 && cj[1][e] <= 84)
			{
				cj[1][e] = 3.3;
			}
			else if (cj[1][e] >= 78 && cj[1][e] <= 81)
			{
				cj[1][e] = 3.0;
			}
			else if (cj[1][e] >= 75 && cj[1][e] <= 77)
			{
				cj[1][e] = 2.7;
			}
			else if (cj[1][e] >= 72 && cj[1][e] <= 74)
			{
				cj[1][e] = 2.3;
			}
			else if (cj[1][e] >= 68 && cj[1][e] <= 71)
			{
				cj[1][e] = 2.0;
			}
			else if (cj[1][e] >= 64 && cj[1][e] <= 67)
			{
				cj[1][e] = 1.5;
			}
			else if (cj[1][e] >= 60 && cj[1][e] <= 63)
			{
				cj[1][e] = 1.0;
			}
			else if (cj[1][e] < 60)
			{
				cj[1][e] = 0;
			}
			s = s + cj[0][e] * cj[1][e];
			a = a + cj[0][e];
		}
		s = s / a;
		System.out.printf("%.2lf",s);
		return 0;
	}

}

