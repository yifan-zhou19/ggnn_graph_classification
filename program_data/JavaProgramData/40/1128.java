package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[5];
		double s = 0.0;
		double S;
		double c;
		double d;
		double e;
		int i;
		for (i = 0;i < 5;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Double.parseDouble(tempVar);
		}
		}
		s = (double)(a[0] + a[1] + a[2] + a[3]) / 2;


		c = (double)(s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]);
		d = (double)a[0] * a[1] * a[2] * a[3];
		e = (double)Math.cos(a[4] * PI / 2.0 / 180.0) * Math.cos(a[4] * PI / 2.0 / 180.0);
		if (c - d * e >= 0)
		{
		S = (double)Math.sqrt(c - d * e);
		System.out.printf("%.4lf\n",S);
		}
		else
		{
			System.out.print("Invalid input\n");
		}
	}
}

