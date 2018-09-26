package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xf = new int[10];
		int i;
		int[] df = new int[10];
		int zxf = 0;
		float[] jd = new float[10];
		float gpa;
		float zjd = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			xf[n - 1] = Integer.parseInt(tempVar3);
		}

		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				df[i] = Integer.parseInt(tempVar4);
			}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			df[n - 1] = Integer.parseInt(tempVar5);
		}

		for (i = 0;i < n;i++)
		{
			if (df[i] >= 90)
			{
				jd[i] = 4.0F;
			}
			else if (df[i] >= 85)
			{
				jd[i] = 3.7F;
			}
			else if (df[i] >= 82)
			{
				jd[i] = 3.3F;
			}
			else if (df[i] >= 78)
			{
				jd[i] = 3.0F;
			}
			else if (df[i] >= 75)
			{
				jd[i] = 2.7F;
			}
			else if (df[i] >= 72)
			{
				jd[i] = 2.3F;
			}
			else if (df[i] >= 68)
			{
				jd[i] = 2.0F;
			}
			else if (df[i] >= 64)
			{
				jd[i] = 1.5F;
			}
			else if (df[i] >= 60)
			{
				jd[i] = 1.0F;
			}
			else
			{
				jd[i] = 0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			zxf += xf[i];
		}
		for (i = 0;i < n;i++)
		{
			zjd += xf[i] * jd[i];
		}
		gpa = zjd / zxf;
		System.out.printf("%.2f",gpa);
		return 0;
	}

}

