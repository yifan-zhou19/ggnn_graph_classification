package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xf = new int[10];
		int[] df = new int[10];
		int n;
		int i;
		int f;
		float j;
		float z;
		float[] jd = new float[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			f = 0;
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
			j = 0F;
			if (df[i] >= 90 && df[i] <= 100)
			{
				jd[i] = 4.0 * xf[i];
			}
			if (df[i] >= 85 && df[i] <= 89)
			{
				jd[i] = 3.7 * xf[i];
			}
			if (df[i] >= 82 && df[i] <= 84)
			{
				jd[i] = 3.3 * xf[i];
			}
			if (df[i] >= 78 && df[i] <= 81)
			{
				jd[i] = 3.0 * xf[i];
			}
			if (df[i] >= 75 && df[i] <= 77)
			{
				jd[i] = 2.7 * xf[i];
			}
			if (df[i] >= 72 && df[i] <= 74)
			{
				jd[i] = 2.3 * xf[i];
			}
			if (df[i] >= 68 && df[i] <= 71)
			{
				jd[i] = 2.0 * xf[i];
			}
			if (df[i] >= 64 && df[i] <= 67)
			{
				jd[i] = 1.5 * xf[i];
			}
			if (df[i] >= 60 && df[i] <= 63)
			{
				jd[i] = 1.0 * xf[i];
			}
			if (df[i] < 60)
			{
				jd[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			f += xf[i];
			j += jd[i];
		}
		z = j / f;
		System.out.printf("%.2f",z);
		return 0;
	}
}

