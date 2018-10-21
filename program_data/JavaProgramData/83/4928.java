package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[10];
		double[] b = new double[10];
		double[] c = new double[10];
		double[] d = new double[10];
		double D = 0;
		double A = 0;
		double GPA;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90 && b[i] <= 100)
			{
				c[i] = 4.0;
			}
			if (b[i] >= 85 && b[i] <= 89)
			{
				c[i] = 3.7;
			}
			if (b[i] >= 82 && b[i] <= 84)
			{
				c[i] = 3.3;
			}
			if (b[i] >= 78 && b[i] <= 81)
			{
				c[i] = 3.0;
			}
			if (b[i] >= 75 && b[i] <= 77)
			{
				c[i] = 2.7;
			}
			if (b[i] >= 72 && b[i] <= 74)
			{
				c[i] = 2.3;
			}
			if (b[i] >= 68 && b[i] <= 71)
			{
				c[i] = 2.0;
			}
			if (b[i] >= 64 && b[i] <= 67)
			{
				c[i] = 1.5;
			}
			if (b[i] >= 60 && b[i] <= 63)
			{
				c[i] = 1.0;
			}
			if (b[i] < 60)
			{
				c[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			d[i] = a[i] * c[i];
		}
		for (i = 0;i < n;i++)
		{
			D += d[i];
			A += a[i];
		}
		GPA = D / A;
		System.out.printf("%.2f\n",GPA);
		return 0;
	}
}

