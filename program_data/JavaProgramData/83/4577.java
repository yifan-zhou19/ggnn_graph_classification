package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q = 0;
		int i;
		int[] xuefen = new int[10];
		int[] chengji = new int[10];
		double p = 0;
		double zong;
		double[] GPA = new double[10];
		double[] xuefenGPA = new double[10];
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
				(xuefen[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(chengji[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (chengji[i] >= 90)
			{
			GPA[i] = 4.0;
			}
			else if (chengji[i] >= 85 && chengji[i] < 90)
			{
			GPA[i] = 3.7;
			}
			else if (chengji[i] >= 82 && chengji[i] < 85)
			{
			GPA[i] = 3.3;
			}
			else if (chengji[i] >= 78 && chengji[i] < 82)
			{
			GPA[i] = 3.0;
			}
			else if (chengji[i] >= 75 && chengji[i] < 78)
			{
			GPA[i] = 2.7;
			}
			else if (chengji[i] >= 72 && chengji[i] < 75)
			{
			GPA[i] = 2.3;
			}
			else if (chengji[i] >= 68 && chengji[i] < 72)
			{
			GPA[i] = 2.0;
			}
			else if (chengji[i] >= 64 && chengji[i] < 68)
			{
			GPA[i] = 1.5;
			}
			else if (chengji[i] >= 60 && chengji[i] < 64)
			{
			GPA[i] = 1.0;
			}
			else
			{
				GPA[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			xuefenGPA[i] = GPA[i] * xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
			p += xuefenGPA[i];
		}
		for (i = 0;i < n;i++)
		{
			q += xuefen[i];
		}
		zong = p / q;
		System.out.printf("%.2lf",zong);

		return 0;


	}

}

