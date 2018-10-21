package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		double GPA;
		double x;
		int[] xuefen = new int[10];
		int[] defen = new int[10];
		double[] jidian = new double[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				(xuefen[i]) = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(xuefen[n - 1]) = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(defen[i]) = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0,s = 0;i <= n - 1;i++)
		{
			s = s + xuefen[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (defen[i] >= 90)
			{
				jidian[i] = 4.0;
			}
			else if (defen[i] >= 85 && defen[i] <= 89)
			{
				jidian[i] = 3.7;
			}
			else if (defen[i] >= 82 && defen[i] <= 84)
			{
				jidian[i] = 3.3;
			}
			else if (defen[i] >= 78 && defen[i] <= 81)
			{
				jidian[i] = 3.0;
			}
			else if (defen[i] >= 75 && defen[i] <= 77)
			{
				jidian[i] = 2.7;
			}
			else if (defen[i] >= 72 && defen[i] <= 74)
			{
				jidian[i] = 2.3;
			}
			else if (defen[i] >= 68 && defen[i] <= 71)
			{
				jidian[i] = 2.0;
			}
			else if (defen[i] >= 64 && defen[i] <= 67)
			{
				jidian[i] = 1.5;
			}
			else if (defen[i] >= 60 && defen[i] <= 63)
			{
				jidian[i] = 1.0;
			}
			else if (defen[i] < 60)
			{
				jidian[i] = 0;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			x = x + 1.0 * jidian[i] * xuefen[i];
		}
		GPA = x / s;
		System.out.printf("%.2lf\n",GPA);
		return 0;
	}

}

