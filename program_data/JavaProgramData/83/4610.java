package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] defen = new int[10];
		int[] xuefen = new int[10];
		int xuefenhe;
		double[] jidian = new double[10];
		double GPA;
		double jidianhe;
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
				xuefen[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				defen[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (defen[i] < 60)
			{
				jidian[i] = 0;
			}
			else if (defen[i] <= 63)
			{
				jidian[i] = 1.0;
			}
			else if (defen[i] <= 67)
			{
				jidian[i] = 1.5;
			}
			else if (defen[i] <= 71)
			{
				jidian[i] = 2.0;
			}
			else if (defen[i] <= 74)
			{
				jidian[i] = 2.3;
			}
			else if (defen[i] <= 77)
			{
				jidian[i] = 2.7;
			}
			else if (defen[i] <= 81)
			{
				jidian[i] = 3.0;
			}
			else if (defen[i] <= 84)
			{
				jidian[i] = 3.3;
			}
			else if (defen[i] <= 89)
			{
				jidian[i] = 3.7;
			}
			else
			{
				jidian[i] = 4.0;
			}
		}
		jidianhe = 0;
		xuefenhe = 0;
		for (i = 0;i < n;i++)
		{
			jidianhe = jidianhe + jidian[i] * xuefen[i];
			xuefenhe = xuefenhe + xuefen[i];
		}
		GPA = jidianhe / xuefenhe;
		System.out.printf("%.2lf",GPA);
		return 0;
	}

}

