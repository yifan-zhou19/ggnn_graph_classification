package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int t;
		int p;
		float jdh = 0F;
		int xfh = 0;
		int[] xf = new int[10];
		int[] df = new int[10];
		float[] jd = new float[10];
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
				xf[i] = Integer.parseInt(tempVar2);
			}
			xfh += xf[i];
		}
		for (k = 0;k < n;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[k] = Integer.parseInt(tempVar3);
			}
		}
		for (p = 0;p < n;p++)
		{
			if (df[p] > 89)
			{
				jd[p] = 4.0F;
			}
			else if (df[p] > 84 && df[p] < 90)
			{
				jd[p] = 3.7F;
			}
			else if (df[p] > 81 && df[p] < 85)
			{
				jd[p] = 3.3F;
			}
			else if (df[p] > 77 && df[p] < 82)
			{
				jd[p] = 3.0F;
			}
			else if (df[p] > 74 && df[p] < 78)
			{
				jd[p] = 2.7F;
			}
			else if (df[p] > 71 && df[p] < 75)
			{
				jd[p] = 2.3F;
			}
			else if (df[p] > 67 && df[p] < 72)
			{
				jd[p] = 2.0F;
			}
			else if (df[p] > 63 && df[p] < 68)
			{
				jd[p] = 1.5F;
			}
			else if (df[p] > 59 && df[p] < 64)
			{
				jd[p] = 1.0F;
			}
			else
			{
				jd[p] = 0F;
			}
		}
		for (t = 0;t < n;t++)
		{
			jdh += xf[t] * jd[t];
		}
		float zjd = jdh / xfh;
		System.out.printf("%.2f",zjd);
		return 0;
	}
}

