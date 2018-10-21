package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float GPA = 0.00F;
		float s = 0F;
		float b = 0F;
		int[] xf = new int[10];
		int[] cj = new int[10];
		float[] jd = new float[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(xf[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(cj[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (cj[i] <= 100 && cj[i] >= 90)
			{
				jd[i] = 4.0F;
			}
			else
			{
			if (cj[i] <= 89 && cj[i] >= 85)
			{
				jd[i] = 3.7F;
			}
		else
		{
			if (cj[i] <= 84 && cj[i] >= 82)
			{
				jd[i] = 3.3F;
			}
		else
		{
			if (cj[i] <= 81 && cj[i] >= 78)
			{
				jd[i] = 3.0F;
			}
		else
		{
			if (cj[i] <= 77 && cj[i] >= 75)
			{
				jd[i] = 2.7F;
			}
		else
		{
			if (cj[i] <= 74 && cj[i] >= 72)
			{
				jd[i] = 2.3F;
			}
		else
		{
			if (cj[i] <= 71 && cj[i] >= 68)
			{
				jd[i] = 2.0F;
			}
		else
		{
			if (cj[i] <= 67 && cj[i] >= 64)
			{
				jd[i] = 1.5F;
			}
		else
		{
			if (cj[i] <= 63 && cj[i] >= 60)
			{
				jd[i] = 1.0F;
			}
		else
		{
			if (cj[i] <= 59 && cj[i] >= 0)
			{
				jd[i] = 0F;
			}
		}
		}
		}
		}
		}
		}
		}
		}
			}
		}
		for (i = 1;i <= n;i++)
		{
			s = s + jd[i] * xf[i];
		}
		for (i = 1;i <= n;i++)
		{
			b = b + xf[i];
		}
		GPA = s / b;
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

