package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t;
		int[] xuefen = new int[10];
		int[] chengji = new int[10];
		float[] xuefenjidian = new float[10];
		float[] jidian = new float[10];
		float sum1 = 0F;
		float sum2 = 0F;
		float zongping;
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
		}
		for (i = 0;i < n;i++)
		{
			if (chengji[i] >= 90 && chengji[i] <= 100)
			{
		jidian[i] = 4.0F;
			}
			else if (chengji[i] >= 85 && chengji[i] <= 89)
			{
			jidian[i] = 3.7F;
			}
			else if (chengji[i] >= 82 && chengji[i] <= 84)
			{
			jidian[i] = 3.3F;
			}
			else if (chengji[i] >= 78 && chengji[i] <= 81)
			{
			jidian[i] = 3.0F;
			}
			else if (chengji[i] >= 75 && chengji[i] <= 77)
			{
			jidian[i] = 2.7F;
			}
			else if (chengji[i] >= 72 && chengji[i] <= 74)
			{
				jidian[i] = 2.3F;
			}
			else if (chengji[i] >= 68 && chengji[i] <= 71)
			{
				jidian[i] = 2.0F;
			}
			else if (chengji[i] >= 64 && chengji[i] <= 67)
			{
			jidian[i] = 1.5F;
			}
			else if (chengji[i] >= 60 && chengji[i] <= 63)
			{
			jidian[i] = 1.0F;
			}
			else if (chengji[i] >= 0 && chengji[i] <= 59)
			{
			jidian[i] = 0F;
			}
			xuefenjidian[i] = xuefen[i] * jidian[i];
		}
		for (i = 0;i < n;i++)
		{
			sum1 = sum1 + xuefenjidian[i];
			sum2 = sum2 + xuefen[i];
		}
		zongping = sum1 / sum2;
		System.out.printf("%.2f",zongping);
	}
}

