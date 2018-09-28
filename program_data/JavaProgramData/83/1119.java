package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] xuefen = new int[10];
		int[] chengji = new int[10];
		float[] jidian = new float[10];
		int n;
		int i;
		int he = 0;
		float sum = 0F;
		float GPA;
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
				chengji[i] = Integer.parseInt(tempVar3);
			}
			if (chengji[i] >= 90 && chengji[i] <= 100)
			{
				jidian[i] = 4.0F;
			}
			if (chengji[i] >= 85 && chengji[i] <= 89)
			{
				jidian[i] = 3.7F;
			}
			if (chengji[i] >= 82 && chengji[i] <= 84)
			{
				jidian[i] = 3.3F;
			}
			if (chengji[i] >= 78 && chengji[i] <= 81)
			{
				jidian[i] = 3.0F;
			}
			if (chengji[i] >= 75 && chengji[i] <= 77)
			{
				jidian[i] = 2.7F;
			}
			if (chengji[i] >= 72 && chengji[i] <= 74)
			{
				jidian[i] = 2.3F;
			}
			if (chengji[i] >= 68 && chengji[i] <= 71)
			{
				jidian[i] = 2.0F;
			}
			if (chengji[i] >= 64 && chengji[i] <= 67)
			{
				jidian[i] = 1.5F;
			}
			if (chengji[i] >= 60 && chengji[i] <= 63)
			{
				jidian[i] = 1.0F;
			}
			if (chengji[i] < 60)
			{
				jidian[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += (float)xuefen[i] * jidian[i];
			he += xuefen[i];
		}
		GPA = (float)sum / he;
		System.out.printf("%.2f",GPA);
	}

}

