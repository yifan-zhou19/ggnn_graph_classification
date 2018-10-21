package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		double[] c = new double[10];
		double sum = 0;
		double[] jd = new double[10];
		double e = 0;
		int i;
		int n;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90)
			{
				c[i] = 4;
			}
			if (b[i] < 90 && b[i] >= 85)
			{
				c[i] = 3.7;
			}
			if (b[i] < 85 && b[i] >= 82)
			{
				c[i] = 3.3;
			}
			if (b[i] < 82 && b[i] >= 78)
			{
				c[i] = 3.0;
			}
			if (b[i] < 78 && b[i] >= 75)
			{
				c[i] = 2.7;
			}
			if (b[i] < 75 && b[i] >= 72)
			{
				c[i] = 2.3;
			}
			if (b[i] < 72 && b[i] >= 68)
			{
				c[i] = 2.0;
			}
			if (b[i] < 68 && b[i] >= 64)
			{
				c[i] = 1.5;
			}
			if (b[i] < 64 && b[i] >= 60)
			{
				c[i] = 1.0;
			}
			if (b[i] < 60)
			{
				c[i] = 0;
			}
			jd[i] = c[i] * a[i];
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + jd[i];
			e = e + a[i];
		}
		sum = sum / e;
		System.out.printf("%.2f",sum);
	}



}

