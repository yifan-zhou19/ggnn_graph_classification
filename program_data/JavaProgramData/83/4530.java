package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xf = new int[10];
		int[] df = new int[10];
		int i;
		double a;
		double sum1 = 0;
		double sum2 = 0;
		double z;
		double[] xfjd = new double[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (90 <= df[i] != 0 && df[i] <= 100)
			{
				a = 4.0;
			}
			if (85 <= df[i] != 0 && df[i] <= 89)
			{
				a = 3.7;
			}
			if (82 <= df[i] != 0 && df[i] <= 84)
			{
				a = 3.3;
			}
			if (78 <= df[i] != 0 && df[i] <= 81)
			{
				a = 3.0;
			}
			if (75 <= df[i] != 0 && df[i] <= 77)
			{
				a = 2.7;
			}
			if (72 <= df[i] != 0 && df[i] <= 74)
			{
				a = 2.3;
			}
			if (68 <= df[i] != 0 && df[i] <= 71)
			{
				a = 2.0;
			}
			if (64 <= df[i] != 0 && df[i] <= 67)
			{
				a = 1.5;
			}
			if (60 <= df[i] != 0 && df[i] <= 63)
			{
				a = 1.0;
			}
			if (df[i] < 60)
			{
				a = 0;
			}
			xfjd[i] = a * xf[i];
		}
		for (i = 0; i < n; i++)
		{
			sum1 = sum1 + xfjd[i];
		}
		for (i = 0; i < n; i++)
		{
			sum2 = sum2 + xf[i];
		}
		for (i = 0; i < n; i++)
		{
			z = sum1 / sum2;
		}
		System.out.printf("%.2f", z);

		return 0;
	}

}

