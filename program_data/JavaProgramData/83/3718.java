package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] xf = new int[10];
		int[] df = new int[10];
		int zxf;
		float GPA;
		float[] jd = new float[10];
		float[] xfjd = new float[10];
		float zxfjd;
		zxfjd = 0F;
		zxf = 0;
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
				(xf[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(df[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (df[i] >= 90 && df[i] < 100)
			{
				jd[i] = 4.0F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] >= 85 && df[i] <= 89)
			{
				jd[i] = 3.7F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] >= 82 && df[i] <= 84)
			{
				jd[i] = 3.3F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] >= 78 && df[i] <= 81)
			{
				jd[i] = 3.0F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] >= 75 && df[i] <= 77)
			{
				jd[i] = 2.7F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] >= 72 && df[i] <= 74)
			{
				jd[i] = 2.3F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] >= 68 && df[i] <= 71)
			{
				jd[i] = 2.0F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] >= 64 && df[i] <= 67)
			{
				jd[i] = 1.5F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] >= 60 && df[i] <= 63)
			{
				jd[i] = 1.0F;
				xfjd[i] = xf[i] * jd[i];
			}
			if (df[i] < 60)
			{
				jd[i] = 0F;
				xfjd[i] = xf[i] * jd[i];
			}

		}
		for (i = 0;i < n;i++)
		{
			zxfjd += xfjd[i];
		}
		for (i = 0;i < n;i++)
		{
			zxf += xf[i];
		}
		GPA = zxfjd / zxf;
		System.out.printf("%.2f",GPA);
	return 0;

	}
}

