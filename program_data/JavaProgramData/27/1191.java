package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double x1;
		double x2;
		double y1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if ((b[i] * b[i] - 4 * a[i] * c[i]) > 0)
			{
				x1 = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				System.out.print("x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if ((b[i] * b[i] - 4 * a[i] * c[i]) == 0)
			{
				x1 = (-b[i] + 0) / (2 * a[i]);
				x2 = x1;
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else if ((b[i] * b[i] - 4 * a[i] * c[i]) < 0)
			{
				if (b[i] == 0)
				{
					y1 = 0;
				}
				else
				{
					y1 = (-b[i]) / (2 * a[i]);
				}
				x1 = (Math.sqrt(Math.abs(b[i] * b[i] - 4 * a[i] * c[i]))) / (2 * a[i]);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", y1);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", y1);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

