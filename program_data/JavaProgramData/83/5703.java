package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xuefen = new int[n];
		int[] defen = new int[n];
		double[] jidian = new double[n];
		double GPA;
		double y = 0;
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
				(defen[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (defen[i] >= 90)
			{
				jidian[i] = 4.0;
			}
			else if ((defen[i] >= 85) && (defen[i] <= 89))
			{
				jidian[i] = 3.7;
			}
			else if ((defen[i] >= 82) && (defen[i] <= 84))
			{
				jidian[i] = 3.3;
			}
			else if ((defen[i] >= 78) && (defen[i] <= 81))
			{
				jidian[i] = 3.0;
			}
			else if ((defen[i] >= 75) && (defen[i] <= 77))
			{
				jidian[i] = 2.7;
			}
			else if ((defen[i] >= 72) && (defen[i] <= 74))
			{
				jidian[i] = 2.3;
			}
			else if ((defen[i] >= 68) && (defen[i] <= 71))
			{
				jidian[i] = 2.0;
			}
			else if ((defen[i] >= 64) && (defen[i] <= 67))
			{
				jidian[i] = 1.5;
			}
			else if ((defen[i] >= 60) && (defen[i] <= 63))
			{
				jidian[i] = 1.0;
			}
			else if (defen[i] < 60)
			{
				jidian[i] = 0.0;
			}
		}
		for (i = 0;i < n;i++)
		{
			y += xuefen[i] * jidian[i];
		}
		for (i = 0;i < n;i++)
		{
			x += xuefen[i];
		}
		GPA = y / x;
		System.out.printf("%.2lf",GPA);
		return 0;
	}



}

