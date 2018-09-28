package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float GPA;
		float total = 0.0F;
		float[] xuefen = new float[20];
		float[] score = new float[20];
		float zongfen = 0.0F;
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
				xuefen[i] = Float.parseFloat(tempVar2);
			}
			zongfen = zongfen + xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (score[i] >= 90F && score[i] <= 100F)
			{
				score[i] = 4.0F;
				continue;
			}
			if (score[i] >= 85F && score[i] <= 89F)
			{
				score[i] = (float)3.7;
				continue;
			}
			if (score[i] >= 82F && score[i] <= 84F)
			{
				score[i] = (float)3.3;
				continue;
			}
			if (score[i] >= 78F && score[i] <= 81F)
			{
				score[i] = 3.0F;
				continue;
			}
			if (score[i] >= 75F && score[i] <= 77F)
			{
				score[i] = (float)2.7;
				continue;
			}
			if (score[i] >= 72F && score[i] <= 74F)
			{
				score[i] = (float)2.3;
				continue;
			}
			if (score[i] >= 68F && score[i] <= 71F)
			{
				score[i] = 2.0F;
				continue;
			}
			if (score[i] >= 64F && score[i] <= 67F)
			{
				score[i] = 1.5F;
				continue;
			}
			if (score[i] >= 60F && score[i] <= 63F)
			{
				score[i] = 1.0F;
				continue;
			}
			if (score[i] < 60F)
			{
				score[i] = 0.0F;
				continue;
			}
		}
		for (i = 0;i < n;i++)
		{
			total = score[i] * xuefen[i] + total;
		}
		GPA = total / zongfen;
		System.out.printf("%.2f\n",GPA);
		return 0;
	}

}

