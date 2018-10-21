package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[][] sz = new float[10][10];
		int k;
		float zong = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[0][i] = Float.parseFloat(tempVar2);
			}
			zong = zong + sz[0][i];
		}
		float sum;
		sum = 0F;
		for (int t = 0;t < k;t++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[1][t] = Float.parseFloat(tempVar3);
			}
			if (sz[1][t] >= 90F && sz[1][t] <= 100F)
			{
				sum = sum + 4 * sz[0][t];
			}
			if (sz[1][t] >= 85F && sz[1][t] <= 89F)
			{
				sum = sum + 3.7 * sz[0][t];
			}
			if (sz[1][t] >= 82F && sz[1][t] <= 84F)
			{
				sum = sum + 3.3 * sz[0][t];
			}
			if (sz[1][t] >= 78F && sz[1][t] <= 81F)
			{
				sum = sum + 3.0 * sz[0][t];
			}
			if (sz[1][t] >= 75F && sz[1][t] <= 77F)
			{
				sum = sum + 2.7 * sz[0][t];
			}
			if (sz[1][t] >= 72F && sz[1][t] <= 74F)
			{
				sum = sum + 2.3 * sz[0][t];
			}
			if (sz[1][t] >= 68F && sz[1][t] <= 71F)
			{
				sum = sum + 2.0 * sz[0][t];
			}
			if (sz[1][t] >= 64F && sz[1][t] <= 67F)
			{
				sum = sum + 1.5 * sz[0][t];
			}
			if (sz[1][t] >= 60F && sz[1][t] <= 63F)
			{
				sum = sum + 1.0 * sz[0][t];
			}
			if (sz[1][t] < 60F)
			{
				sum = sum + 0 * sz[0][t];
			}
		}
		float GPA;
		GPA = sum / zong;
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

