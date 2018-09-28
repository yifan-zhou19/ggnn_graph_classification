package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		float GPA;
		float sum1 = 0F;
		float sum2 = 0F;
		int[] xuefen = new int[100];
		float[] score = new float[100];

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
				score[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((score[i] >= 90F) && (score[i] <= 100F))
			{
				score[i] = 4.0F;
			}
			else if ((score[i] >= 85F) && (score[i] <= 89F))
			{
				score[i] = 3.7F;
			}
			else if ((score[i] >= 82F) && (score[i] <= 84F))
			{
				score[i] = 3.3F;
			}
			else if ((score[i] >= 78F) && (score[i] <= 81F))
			{
				score[i] = 3.0F;
			}
			else if ((score[i] >= 75F) && (score[i] <= 77F))
			{
				score[i] = 2.7F;
			}
			else if ((score[i] >= 72F) && (score[i] <= 74F))
			{
				score[i] = 2.3F;
			}
			else if ((score[i] >= 68F) && (score[i] <= 71F))
			{
				score[i] = 2.0F;
			}
			else if ((score[i] >= 64F) && (score[i] <= 67F))
			{
				score[i] = 1.5F;
			}
			else if ((score[i] >= 60F) && (score[i] <= 63F))
			{
				score[i] = 1.0F;
			}
			else if ((score[i] >= 0F) && (score[i] < 60F))
			{
				score[i] = 0.0F;
			}
		}

		for (i = 0;i < n;i++)
		{
			sum1 = sum1 + (xuefen[i] * score[i]);
			sum2 = sum2 + xuefen[i];
		}
		GPA = sum1 / sum2;

		System.out.printf("%.2f",GPA);
	}



}

