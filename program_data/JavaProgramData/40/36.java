package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[5];
		double s;
		double S;
		double c;
		double b;
		int i;
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
		}
		b = a[0] * a[1] * a[2] * a[3] * Math.cos(a[4] / 2 * pai / 180) * Math.cos(a[4] / 2 * pai / 180);
		s = 1.0 / 2 * (a[0] + a[1] + a[2] + a[3]);
		c = (s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]);
		if (c < b)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt(c - b);
		System.out.printf("%.4lf\n",S);
		}
		return 0;

	}

}

