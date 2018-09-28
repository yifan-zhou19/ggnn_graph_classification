package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int xfh;
		int[] xf = new int[num];
		int[] fs = new int[num];
		float[] jd = new float[num];
		float jdh;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				fs[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (fs[i] <= 100 && fs[i] >= 90)
			{
				jd[i] = 4.0F;
			}
		if (fs[i] <= 89 && fs[i] >= 85)
		{
			jd[i] = 3.7F;
		}
		if (fs[i] <= 84 && fs[i] >= 82)
		{
			jd[i] = 3.3F;
		}
		if (fs[i] <= 81 && fs[i] >= 78)
		{
			jd[i] = 3.0F;
		}
		if (fs[i] <= 77 && fs[i] >= 75)
		{
			jd[i] = 2.7F;
		}
		if (fs[i] <= 74 && fs[i] >= 72)
		{
			jd[i] = 2.3F;
		}
		if (fs[i] <= 71 && fs[i] >= 68)
		{
			jd[i] = 2.0F;
		}
		if (fs[i] <= 67 && fs[i] >= 64)
		{
			jd[i] = 1.5F;
		}
		if (fs[i] <= 63 && fs[i] >= 60)
		{
			jd[i] = 1.0F;
		}
		if (fs[i] < 60)
		{
			jd[i] = 0F;
		}
		}
		xfh = 0;
		jdh = 0F;
		for (i = 0;i < n;i++)
		{
			xfh = xfh + xf[i];
		}
		for (i = 0;i < n;i++)
		{
			jdh = jdh + jd[i] * xf[i];
		}
		GPA = jdh / xfh;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

