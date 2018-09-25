package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xuefen = new int[10];
		int sum1 = 0;
		float[] defen = new float[10];
		float[] jidian = new float[10];
		float[] xueji = new float[10];
		float gpa;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[i] = Integer.parseInt(tempVar2);
			}
			sum1 += xuefen[i];
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				defen[j] = Float.parseFloat(tempVar3);
			}
			if (defen[j] >= 90F)
			{
				jidian[j] = 4.0F;
			}
			else if (defen[j] >= 85F && defen[j] <= 89F)
			{
				jidian[j] = 3.7F;
			}
			else if (defen[j] >= 82F && defen[j] <= 84F)
			{
				jidian[j] = 3.3F;
			}
			else if (defen[j] >= 78F && defen[j] <= 81F)
			{
				jidian[j] = 3.0F;
			}
			else if (defen[j] >= 75F && defen[j] <= 77F)
			{
				jidian[j] = 2.7F;
			}
			else if (defen[j] >= 72F && defen[j] <= 74F)
			{
				jidian[j] = 2.3F;
			}
			else if (defen[j] >= 68F && defen[j] <= 71F)
			{
				jidian[j] = 2.0F;
			}
			else if (defen[j] >= 64F && defen[j] <= 67F)
			{
				jidian[j] = 1.5F;
			}
			else if (defen[j] >= 60F && defen[j] <= 63F)
			{
				jidian[j] = 1.0F;
			}
			else
			{
				jidian[j] = 0F;
			}
		}
		int k;
		float sum2;
		for (k = 0;k < n;k++)
		{
			xueji[k] = jidian[k] * xuefen[k];
			sum2 += xueji[k];
		}
		gpa = sum2 / (float)sum1;
		System.out.printf("%.2f",gpa);
		return 0;
	}

}

