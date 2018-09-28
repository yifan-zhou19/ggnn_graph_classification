package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if ((b[i] * b[i] - 4 * a[i] * c[i]) > 0)
			{
				System.out.print("x1=");
				System.out.printf("%.5f", (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]));
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]));
			}
			if ((b[i] * b[i] - 4 * a[i] * c[i]) == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", -b[i] / (2 * a[i]));
			}
			if ((b[i] * b[i] - 4 * a[i] * c[i]) < 0)
			{
				if (b[i] == 0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]));
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]));
					System.out.printf("%.5f", "i");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", -b[i] / (2 * a[i]));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]));
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", -b[i] / (2 * a[i]));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(4 * a[i] * c[i] - b[i] * b[i]) / (2 * a[i]));
					System.out.printf("%.5f", "i");
				}
			}
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

