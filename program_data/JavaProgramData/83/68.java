package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] xuefen = new int[10];
		int[] chengji = new int[10];
		int sum1 = 0;
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
			 sum1 = sum1 + xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chengji[i] = Integer.parseInt(tempVar3);
			}
		}
		float[] jidian = new float[10];
		for (i = 0;i < n;i++)
		{
		if (chengji[i] <= 100 && chengji[i] >= 90)
		{
			jidian[i] = 4.0F;
		}
		if (chengji[i] <= 89 && chengji[i] >= 85)
		{
			jidian[i] = 3.7F;
		}
		if (chengji[i] <= 84 && chengji[i] >= 82)
		{
			jidian[i] = 3.3F;
		}
		if (chengji[i] <= 81 && chengji[i] >= 78)
		{
			jidian[i] = 3.0F;
		}
		if (chengji[i] <= 77 && chengji[i] >= 75)
		{
			jidian[i] = 2.7F;
		}
		if (chengji[i] <= 74 && chengji[i] >= 72)
		{
			jidian[i] = 2.3F;
		}
		if (chengji[i] <= 71 && chengji[i] >= 68)
		{
			jidian[i] = 2.0F;
		}
		if (chengji[i] <= 67 && chengji[i] >= 64)
		{
			jidian[i] = 1.5F;
		}
		if (chengji[i] <= 63 && chengji[i] >= 60)
		{
			jidian[i] = 1.0F;
		}
		if (chengji[i] <= 59)
		{
			jidian[i] = 0F;
		}
		}
		float[] xuefenjidian = new float[10];
		float sum2 = 0F;
		int j;
		for (j = 0;j < i;j++)
		{
			xuefenjidian[j] = jidian[j] * xuefen[j];
			sum2 = sum2 + xuefenjidian[j];
		}
		float GPA;
		GPA = sum2 / sum1;
		System.out.printf("%.2f",GPA);
	}


}

