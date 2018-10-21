package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] defen = new int[10];
		int i;
		int zongxuefen = 0;
		int[] xuefen = new int[10];
		double result;
		double sum = 0;
		double[] jidian = new double[10];
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
			zongxuefen += xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				defen[i] = Integer.parseInt(tempVar3);
			}
			if (defen[i] >= 90)
			{
				jidian[i] = 4.0;
			}
			else if (defen[i] >= 85)
			{
				jidian[i] = 3.7;
			}
			else if (defen[i] >= 82)
			{
				jidian[i] = 3.3;
			}
			else if (defen[i] >= 78)
			{
				jidian[i] = 3.0;
			}
			else if (defen[i] >= 75)
			{
				jidian[i] = 2.7;
			}
			else if (defen[i] >= 72)
			{
				jidian[i] = 2.3;
			}
			else if (defen[i] >= 68)
			{
				jidian[i] = 2.0;
			}
			else if (defen[i] >= 64)
			{
				jidian[i] = 1.5;
			}
			else if (defen[i] >= 60)
			{
				jidian[i] = 1.0;
			}
			else
			{
				jidian[i] = 0;
			}
		}
			for (i = 0;i < n;i++)
			{
				sum += jidian[i] * xuefen[i];
			}
			result = sum / zongxuefen;
			System.out.printf("%.2lf",result);
			return 0;
	}

}

