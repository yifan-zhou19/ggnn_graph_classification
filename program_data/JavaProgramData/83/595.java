package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[2][10];
		int sub;
		int i;
		int j;
		float GPA;
		float[] g = new float[10];
		float[] subjd = new float[10];
		float sumxf = 0F;
		float sumjd = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sub = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < sub;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (j = 0;j < sub;j++)
		{
			if (a[1][j] <= 100 && a[1][j] >= 90)
			{
				g[j] = 4.0F;
			}
			else if (a[1][j] >= 85)
			{
				g[j] = 3.7F;
			}
			else if (a[1][j] >= 82)
			{
				g[j] = 3.3F;
			}
			else if (a[1][j] >= 78)
			{
				g[j] = 3.0F;
			}
			else if (a[1][j] >= 75)
			{
				g[j] = 2.7F;
			}
			else if (a[1][j] >= 72)
			{
				g[j] = 2.3F;
			}
			else if (a[1][j] >= 68)
			{
				g[j] = 2.0F;
			}
			else if (a[1][j] >= 64)
			{
				g[j] = 1.5F;
			}
			else if (a[1][j] >= 60)
			{
				g[j] = 1.0F;
			}
			else if (a[1][j] < 60)
			{
				g[j] = 0F;
			}
		}
		for (j = 0;j < sub;j++)
		{
			subjd[j] = g[j] * a[0][j];
			sumxf = sumxf + a[0][j];
			sumjd = sumjd + subjd[j];
		}
		GPA = sumjd / sumxf;
		System.out.printf("%.2f",GPA);
	}

}

