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
		int[] a = new int[11];
		int[] b = new int[11];
		int i;
		double[] c = new double[11];
		double k;
		k = 0.0;
		double p;
		p = 0.0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			p = p + a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
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
			else if (b[i] < 60)
			{
				c[i] = 0.0;
			}
			k = k + c[i] * a[i];
		}
		double GPA;
		GPA = k / p;
		System.out.printf("%.2lf",GPA);
		return 0;
	}
}

