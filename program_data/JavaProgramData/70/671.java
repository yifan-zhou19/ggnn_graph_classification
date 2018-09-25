package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double m;
		double f = new double(double x, double y);
		int n;
		int i;
		int j;
		int t;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		t = 0;
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				c[t] = f(a[i] - a[j], b[i] - b[j]);
				t++;
			}
		}
		m = 0;
		for (i = 0; i < t - 1; i++)
		{
			if (m < c[i])
			{
				m = c[i];
			}
		}
		System.out.printf("%.4f\n", m);
	}

	public static double f(double x, double y)
	{
		double z;
		z = Math.sqrt(x * x + y * y);
		return (z);
	}
}

