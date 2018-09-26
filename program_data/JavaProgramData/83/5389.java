package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xf = new int[n];
		int[] cj = new int[n];
		int i;
		float[] jd = new float[n];
		float a;
		float b;
		a = 0F;
		b = 0F;
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
		if (cj[i] < 60)
		{
			jd[i] = 0F;
		}
		if (cj[i] >= 60 && cj[i] <= 63)
		{
			jd[i] = 1.0F;
		}
		if (cj[i] >= 64 && cj[i] <= 67)
		{
			jd[i] = 1.5F;
		}
		if (cj[i] >= 68 && cj[i] <= 71)
		{
			jd[i] = 2.0F;
		}
		if (cj[i] >= 72 && cj[i] <= 74)
		{
			jd[i] = 2.3F;
		}
		if (cj[i] >= 75 && cj[i] <= 77)
		{
			jd[i] = 2.7F;
		}
		if (cj[i] >= 78 && cj[i] <= 81)
		{
			jd[i] = 3.0F;
		}
		if (cj[i] >= 82 && cj[i] <= 84)
		{
			jd[i] = 3.3F;
		}
		if (cj[i] >= 85 && cj[i] <= 89)
		{
			jd[i] = 3.7F;
		}
		if (cj[i] >= 90 && cj[i] <= 100)
		{
			jd[i] = 4.0F;
		}
		a = a + xf[i] * jd[i];
		b = b + xf[i];
		}
		a = a / b;
		System.out.printf("%.2f",a);
		return 0;
	}
}

