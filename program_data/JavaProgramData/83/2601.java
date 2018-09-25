package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int zongxuefen = 0;
		int[] chengji = new int[10];
		int[] xuefen = new int[10];
		double zongpingjidian = 0;
		double[] jidian = new double[10];
		double zongjidian = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  xuefen[i] = Integer.parseInt(tempVar2);
		  }
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chengji[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 1;i <= n;i++)
		{
			if ((chengji[i] >= 90) && (chengji[i] <= 100))
			{
			jidian[i] = 4.0;
			}
		if ((chengji[i] >= 85) && (chengji[i] <= 89))
		{
			jidian[i] = 3.7;
		}
		if ((chengji[i] >= 82) && (chengji[i] <= 84))
		{
			jidian[i] = 3.3;
		}
		if ((chengji[i] >= 78) && (chengji[i] <= 81))
		{
			jidian[i] = 3.0;
		}
		if ((chengji[i] >= 75) && (chengji[i] <= 77))
		{
			jidian[i] = 2.7;
		}
		if ((chengji[i] >= 72) && (chengji[i] <= 74))
		{
			jidian[i] = 2.3;
		}
		if ((chengji[i] >= 68) && (chengji[i] <= 71))
		{
			jidian[i] = 2.0;
		}
		if ((chengji[i] >= 64) && (chengji[i] <= 67))
		{
			jidian[i] = 1.5;
		}
		if ((chengji[i] >= 60) && (chengji[i] <= 63))
		{
			jidian[i] = 1.0;
		}
		if (chengji[i] <= 60)
		{
			jidian[i] = 0;
		}
		zongjidian += 1.0 * xuefen[i] * jidian[i];
				zongxuefen += xuefen[i];
		}
		zongpingjidian = 1.0 * zongjidian / zongxuefen;
		System.out.printf("%.2lf",zongpingjidian);
	return 0;


	}

}

