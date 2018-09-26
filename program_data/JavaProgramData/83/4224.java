package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] xf = new int[10];
		int[] cj = new int[10];
		float a;
		float b;
		float[] jd = new float[10];
		float GPA;
		a = 0F;
		b = 0F;
		GPA = 0F;
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
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cj[i] >= 90)
			{
				jd[i] = 4.0f;
			}
			else if (cj[i] >= 85)
			{
				jd[i] = 3.7f;
			}
			else if (cj[i] >= 82)
			{
				jd[i] = 3.3f;
			}
			else if (cj[i] >= 78)
			{
				jd[i] = 3.0f;
			}
			else if (cj[i] >= 75)
			{
				jd[i] = 2.7f;
			}
			else if (cj[i] >= 72)
			{
				jd[i] = 2.3f;
			}
			else if (cj[i] >= 68)
			{
				jd[i] = 2.0f;
			}
			else if (cj[i] >= 64)
			{
				jd[i] = 1.5f;
			}
			else
			{
				jd[i] = 0.0f;
			}
		}
		for (i = 0;i < n;i++)
		{
			a += xf[i];
		}
		for (i = 0;i < n;i++)
		{
			b += jd[i] * xf[i];
		}
		GPA = b / a;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

