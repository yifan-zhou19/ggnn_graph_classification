package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[101];
		double[] b = new double[101];
		double[] c = new double[101];
		double[] d = new double[101];
		for (int i = 1 ; i <= n ; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d[i] = b[i] * b[i] - 4 * a[i] * c[i];
		}
		for (int j = 1 ; j <= n ; j++)
		{
			if (b[j] == 0)
			{
				if (d[j] == 0)
				{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", b[j] / (2.0 * a[j]));
				System.out.printf("%.5f", "\n");
				}
				else
				{
					if (d[j] > 0)
					{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", (-b[j] + Math.sqrt(d[j])) / (2.0 * a[j]));
						System.out.printf("%.5f", ";x2=");
						System.out.printf("%.5f", (-b[j] - Math.sqrt(d[j])) / (2.0 * a[j]));
						System.out.printf("%.5f", "\n");
					}
					else
					{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", b[j] / (2.0 * a[j]));
						System.out.printf("%.5f", "+");
						System.out.printf("%.5f", Math.sqrt(-d[j]) / (2.0 * a[j]));
						System.out.printf("%.5f", "i;x2=");
						System.out.printf("%.5f", b[j] / (2.0 * a[j]));
						System.out.printf("%.5f", "-");
						System.out.printf("%.5f", Math.sqrt(-d[j]) / (2.0 * a[j]));
						System.out.printf("%.5f", "i");
						System.out.printf("%.5f", "\n");
					}
				}
			}
			else
			{
				if (d[j] == 0)
				{
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", -b[j] / (2.0 * a[j]));
					System.out.printf("%.5f", "\n");
				}
				else
				{
					if (d[j] > 0)
					{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", (-b[j] + Math.sqrt(d[j])) / (2.0 * a[j]));
						System.out.printf("%.5f", ";x2=");
						System.out.printf("%.5f", (-b[j] - Math.sqrt(d[j])) / (2.0 * a[j]));
						System.out.printf("%.5f", "\n");
					}
					else
					{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", -b[j] / (2.0 * a[j]));
						System.out.printf("%.5f", "+");
						System.out.printf("%.5f", Math.sqrt(-d[j]) / (2.0 * a[j]));
						System.out.printf("%.5f", "i;x2=");
						System.out.printf("%.5f", -b[j] / (2.0 * a[j]));
						System.out.printf("%.5f", "-");
						System.out.printf("%.5f", Math.sqrt(-d[j]) / (2.0 * a[j]));
						System.out.printf("%.5f", "i");
						System.out.printf("%.5f", "\n");
					}
				}
			}
		}

		return 0;
	}
}

