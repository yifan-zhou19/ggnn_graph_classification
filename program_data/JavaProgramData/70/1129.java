package <missing>;

public class GlobalMembers
{
	public static float max(float[] d)
	{
		float maxd = 0F;
		for (int i = 0;i < 1000;i++)
		{
			if (d[i] > maxd)
			{
				maxd = d[i];
			}
		}
		return maxd;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[][] p = new float[100][2];
		float[] d = new float[1000];
		int i;
		int j;
		int k = 0;
		for (i = 0;i < 1000;i++)
		{
			d[i] = 0F;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i][1] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = Math.sqrt((p[i][0] - p[j][0]) * (p[i][0] - p[j][0]) + (p[i][1] - p[j][1]) * (p[i][1] - p[j][1]));
				k++;
			}
		}
		float maxd;
		maxd = max(d);
		System.out.printf("%.4f",maxd);
	}
}

