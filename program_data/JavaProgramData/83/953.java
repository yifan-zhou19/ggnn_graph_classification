package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
	double[] c = new double[10];
	double sum1 = 0;
	double sum2 = 0;
	double[] b = new double[10];
	double[] a = new double[10];
	double GPA;
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
				a[i] = Double.parseDouble(tempVar2);
			}
		sum2 += a[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		if (b[i] >= 90 && b[i] <= 100)
		{
			c[i] = 4.0 * a[i];
		}
		else if (b[i] >= 85 && b[i] <= 89)
		{
			c[i] = 3.7 * a[i];
		}
		else if (b[i] >= 82 && b[i] <= 84)
		{
			c[i] = 3.3 * a[i];
		}
		else if (b[i] >= 78 && b[i] <= 81)
		{
			c[i] = 3.0 * a[i];
		}
		else if (b[i] >= 75 && b[i] <= 77)
		{
			c[i] = 2.7 * a[i];
		}
		else if (b[i] >= 72 && b[i] <= 74)
		{
			c[i] = 2.3 * a[i];
		}
		else if (b[i] >= 68 && b[i] <= 71)
		{
			c[i] = 2.0 * a[i];
		}
		else if (b[i] >= 64 && b[i] <= 67)
		{
			c[i] = 1.5 * a[i];
		}
		else if (b[i] >= 60 && b[i] <= 63)
		{
			c[i] = 1.0 * a[i];
		}
		else if (b[i] < 60)
		{
			c[i] = 0;
		}
		sum1 += c[i];
		}
		GPA = sum1 / sum2;
		System.out.printf("%.2lf",GPA);
	}
}

