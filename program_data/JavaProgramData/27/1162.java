package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		double p;
		double q;
		double x1 = 0;
		double x2 = 0;
		for (i = 0;i < n;i = i + 1)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i = i + 1)
		{
			p = (-1) * b[i] / (2 * a[i]);
			q = Math.pow(b[i],2) - 4 * a[i] * c[i];
			if (q == 0)
			{
				x1 = x2 = p;
				if (p > -0.00000001 && p < 0.00000001)
				{
					p = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", p);
				System.out.printf("%.5f", "\n");
			}
				else if (q > 0)
				{
					x1 = p + Math.sqrt(q) / (2 * a[i]);
					x2 = p - Math.sqrt(q) / (2 * a[i]);
					if (x1 > -0.00000001 && x1 < 0.0000001)
					{
						x1 = 0.0000;
					}
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
			if (q < 0)
			{
				q = Math.sqrt(-q) / (2 * a[i]);
				if (p > -0.00000001 && p < 0.00000001)
				{
					p = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", p);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", q);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", p);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", q);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}



	   return 0;
	}
}

