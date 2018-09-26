package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] score = new double[20];
		double[] mark = new double[20];
		double ret = 0.0;
		double sum1 = 0.0;
		double sum2 = 0.0;

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
				score[i] = Double.parseDouble(tempVar2);
			}
			sum1 += score[i];
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mark[i] = Double.parseDouble(tempVar3);
			}
			if (mark[i] >= 90)
			{
				mark[i] = 4.0;
				continue;
			}
			if (mark[i] >= 85)
			{
				mark[i] = 3.7;
				continue;
			}
			if (mark[i] >= 82)
			{
				mark[i] = 3.3;
				continue;
			}
			if (mark[i] >= 78)
			{
				mark[i] = 3.0;
				continue;
			}
			if (mark[i] >= 75)
			{
				mark[i] = 2.7;
				continue;
			}
			if (mark[i] >= 72)
			{
				mark[i] = 2.3;
				continue;
			}
			if (mark[i] >= 68)
			{
				mark[i] = 2.0;
				continue;
			}
			if (mark[i] >= 64)
			{
				mark[i] = 1.5;
				continue;
			}
			if (mark[i] >= 60)
			{
				mark[i] = 1.0;
				continue;
			}
			if (mark[i] < 60)
			{
				mark[i] = 0.0;
				continue;
			}
		}
		for (int i = 0;i < n;i++)
		{
			sum2 += mark[i] * score[i];
		}
		ret = sum2 / sum1;
		System.out.printf("%.2lf",ret);

		return 0;
	}

}

