package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] x = new int[10];
		int f;
		int sum = 0;
		int m;
		float zong;
		float[] j = new float[10];
		float he = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (m = 0;m < k;m++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(x[m]) = Integer.parseInt(tempVar2);
		}
		sum += x[m];
		}
		for (m = 0;m < k;m++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			f = Integer.parseInt(tempVar3);
		}
		if (f >= 90 && f <= 100)
		{
		j[m] = 4.0F;
		}
		else if (f >= 85 && f <= 89)
		{
		j[m] = 3.7F;
		}
		else if (f >= 82 && f <= 84)
		{
		j[m] = 3.3F;
		}
		else if (f >= 78 && f <= 81)
		{
		j[m] = 3.0F;
		}
		else if (f >= 75 && f <= 77)
		{
		j[m] = 2.7F;
		}
		else if (f >= 72 && f <= 74)
		{
		j[m] = 2.3F;
		}
		else if (f >= 68 && f <= 71)
		{
		j[m] = 2.0F;
		}
		else if (f >= 64 && f <= 67)
		{
		j[m] = 1.5F;
		}
		else if (f >= 60 && f <= 63)
		{
		j[m] = 1.0F;
		}
		else if (f < 60)
		{
		j[m] = 0F;
		}
		}
		for (m = 0;m < k;m++)
		{
		he += j[m] * x[m];
		}
		zong = he / sum;
		System.out.printf("%.2f\n",zong);
		return 0;
	}
}

