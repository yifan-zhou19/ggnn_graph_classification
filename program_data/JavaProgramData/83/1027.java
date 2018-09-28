package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[9];
		int[] c = new int[9];
		int sumx = 0;
		float zjd = 0F;
		float[] xj = new float[9];
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			sumx += x[i];
		};
		for (int k = 0;k < n;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[k] = Integer.parseInt(tempVar3);
			}
		};
		for (int j = 0;j < n;j++)
		{
			if (90 <= c[j] != 0 && c[j] <= 100)
			{
				xj[j] = 4.0F;
			};
			if (85 <= c[j] != 0 && c[j] <= 89)
			{
				xj[j] = 3.7F;
			};
			if (82 <= c[j] != 0 && c[j] <= 84)
			{
				xj[j] = 3.3F;
			};
			if (78 <= c[j] != 0 && c[j] <= 81)
			{
				xj[j] = 3.0F;
			};
			if (75 <= c[j] != 0 && c[j] <= 77)
			{
				xj[j] = 2.7F;
			};
			if (72 <= c[j] != 0 && c[j] <= 74)
			{
				xj[j] = 2.3F;
			};
			if (68 <= c[j] != 0 && c[j] <= 71)
			{
				xj[j] = 2.0F;
			};
			if (64 <= c[j] != 0 && c[j] <= 67)
			{
				xj[j] = 1.5F;
			};
			if (60 <= c[j] != 0 && c[j] <= 63)
			{
				xj[j] = 1.0F;
			};
			if (0 <= c[j] != 0 && c[j] <= 59)
			{
				xj[j] = 0F;
			};
		};
		for (int m = 0;m < n;m++)
		{
			sum += xj[m] * x[m];
		};
		zjd = sum / sumx;
		System.out.printf("%.2lf\n",zjd);
		return 0;
	}

}

