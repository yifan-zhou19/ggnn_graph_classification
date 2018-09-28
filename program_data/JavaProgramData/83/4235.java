package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[10];
		double[] b = new double[10];
		double[] c = new double[10];
		int N;
		int i;
		int k = 0;
		int x;
		double total1 = 0;
		double total2 = 0;
		double GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			a[i] = x;
		}
		for (i = 0;i < N;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			b[i] = x;
		}
		for (i = 0;i < N;i++)
		{
			if (b[i] >= 90 && b[i] <= 100)
			{
				c[i] = 4.0;
			}
			else if (b[i] >= 85 && b[i] <= 89)
			{
				c[i] = 3.7;
			}
			else if (b[i] >= 82 && b[i] <= 84)
			{
				c[i] = 3.3;
			}
			else if (b[i] >= 78 && b[i] <= 81)
			{
				c[i] = 3.0;
			}
			else if (b[i] >= 75 && b[i] <= 77)
			{
				c[i] = 2.7;
			}
			else if (b[i] >= 72 && b[i] <= 74)
			{
				c[i] = 2.3;
			}
			else if (b[i] >= 68 && b[i] <= 71)
			{
				c[i] = 2.0;
			}
			else if (b[i] >= 64 && b[i] <= 67)
			{
				c[i] = 1.5;
			}
			else if (b[i] >= 60 && b[i] <= 63)
			{
				c[i] = 1.0;
			}
			else if (b[i] >= 0 && b[i] <= 59)
			{
				c[i] = 0;
			}
		}
		for (i = 0;i < N;i++)
		{
			total1 += a[i] * c[i];
		}
		for (i = 0;i < N;i++)
		{
			total2 += a[i];
		}
		GPA = total1 / total2;
		System.out.printf("%.2lf",GPA);
		return 0;
	}

}

