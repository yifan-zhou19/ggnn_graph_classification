package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		double[] c = new double[10];
		double GPA = 0;
		double sum_1 = 0;
		double sum_2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;i < n;i++)
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
			if (b[i] < 60)
			{
				c[i] = 0;
			}
			if (b[i] >= 60 && b[i] <= 63)
			{
				c[i] = 1;
			}
			if (b[i] >= 64 && b[i] <= 67)
			{
				c[i] = 1.5;
			}
			if (b[i] >= 68 && b[i] <= 71)
			{
				c[i] = 2;
			}
			if (b[i] >= 72 && b[i] <= 74)
			{
				c[i] = 2.3;
			}
			if (b[i] >= 75 && b[i] <= 77)
			{
				c[i] = 2.7;
			}
			if (b[i] >= 78 && b[i] <= 81)
			{
				c[i] = 3;
			}
			if (b[i] >= 82 && b[i] <= 84)
			{
				c[i] = 3.3;
			}
			if (b[i] >= 85 && b[i] <= 89)
			{
				c[i] = 3.7;
			}
			if (b[i] >= 90 && b[i] <= 100)
			{
				c[i] = 4;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum_1 += a[i] * c[i];
		}
		for (i = 0;i < n;i++)
		{
			sum_2 += a[i];
		}
		GPA = sum_1 / sum_2;
		System.out.printf("%.2lf",GPA);
	}


}

