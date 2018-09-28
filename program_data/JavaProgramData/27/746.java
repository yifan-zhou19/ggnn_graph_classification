package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] p = new double[100];
		double[] n = new double[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			p[i] = b[i] * b[i] - 4 * a[i] * c[i];
			if (p[i] > 0)
			{
				x[i] = ((-b[i]) + Math.sqrt(p[i])) / 2 / a[i];
				y[i] = ((-b[i]) - Math.sqrt(p[i])) / 2 / a[i];
			}
			else if (p[i] == 0)
			{
				x[i] = (-b[i]) / 2 / a[i];
			}
			else
			{
				x[i] = (-b[i]) / 2 / a[i];
				y[i] = (-b[i]) / 2 / a[i];
				n[i] = Math.sqrt(0 - p[i]) / 2 / a[i];
			}
		}
		for (i = 1;i <= k;i++)
		{
			if (p[i] > 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x[i]);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", y[i]);
				System.out.printf("%.5f", "\n");
			}
			else if (p[i] == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x[i]);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (x[i] == -0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", -x[i]);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", n[i]);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", -y[i]);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", n[i]);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x[i]);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", n[i]);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", y[i]);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", n[i]);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
			}
		}
		return 0;
	}

}

