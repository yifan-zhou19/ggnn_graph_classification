package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double gpa;
		double[] jd = new double[10];
		double[] xuefenjd = new double[10];
		double[] xuefen = new double[10];
		double[] defen = new double[10];
		double sum1 = 0.0;
		double sum2 = 0.0;
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
				(xuefen[i]) = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(defen[i]) = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (defen[i] >= 90 && defen[i] <= 100)
			{
				jd[i] = 4.0;
			}
			if (defen[i] >= 85 && defen[i] <= 89)
			{
				jd[i] = 3.7;
			}
			if (defen[i] >= 82 && defen[i] <= 84)
			{
				jd[i] = 3.3;
			}
			if (defen[i] >= 78 && defen[i] <= 81)
			{
				jd[i] = 3.0;
			}
			if (defen[i] >= 75 && defen[i] <= 77)
			{
				jd[i] = 2.7;
			}
			if (defen[i] >= 72 && defen[i] <= 74)
			{
				jd[i] = 2.3;
			}
			if (defen[i] >= 68 && defen[i] <= 71)
			{
				jd[i] = 2.0;
			}
			if (defen[i] >= 64 && defen[i] <= 67)
			{
				jd[i] = 1.5;
			}
			if (defen[i] >= 60 && defen[i] <= 63)
			{
				jd[i] = 1.0;
			}
			if (defen[i] < 60)
			{
				jd[i] = 0.0;
			}
			xuefenjd[i] = 1.0 * xuefen[i] * jd[i];
			sum1 += xuefen[i];
			sum2 += xuefenjd[i];
		}
		gpa = 1.0 * sum2 / sum1;
		System.out.printf("%.2lf\n",gpa);
		return 0;
	}
}

