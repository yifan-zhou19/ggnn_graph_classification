package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[] chengji = new int[10];
			int i;
			int[] xuefen = new int[10];
			int n;
			int j;
			int s = 0;
			double t = 0;
	double GPA;
	double[] point = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[j] = Integer.parseInt(tempVar2);
			}
			s += xuefen[j];
	}
	for (i = 0;i < n;i++)
	{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chengji[i] = Integer.parseInt(tempVar3);
			}
		if ((chengji[i] >= 90) && (chengji[i] <= 100))
		{
			point[i] = 4.0;
		}
		else if ((chengji[i] >= 85) && (chengji[i] <= 89))
		{
			point[i] = 3.7;
		}
		else if ((chengji[i] >= 82) && (chengji[i] <= 84))
		{
			point[i] = 3.3;
		}
		else if ((chengji[i] >= 78) && (chengji[i] <= 81))
		{
			point[i] = 3.0;
		}
		else if ((chengji[i] >= 75) && (chengji[i] <= 77))
		{
			point[i] = 2.7;
		}
		else if ((chengji[i] >= 72) && (chengji[i] < 74))
		{
			point[i] = 2.3;
		}
		else if ((chengji[i] >= 68) && (chengji[i] <= 71))
		{
			point[i] = 2.0;
		}
		else if ((chengji[i] >= 64) && (chengji[i] <= 67))
		{
			point[i] = 1.5;
		}
		else if ((chengji[i] >= 60) && (chengji[i] <= 63))
		{
			point[i] = 1.0;
		}
		else
		{
			point[i] = 0;
		}
		t += point[i] * xuefen[i];

	}
		GPA = 1.0 * t / s;
		System.out.printf("%.2f",GPA);
		return 0;
	}


}

