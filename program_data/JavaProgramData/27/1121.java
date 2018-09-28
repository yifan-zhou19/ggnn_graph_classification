package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			double[] a = new double[100];
			double[] b = new double[100];
			double[] c = new double[100];
			double d;
			double x1;
			double x2;
			double f;
			double g;

			 a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 d = b[i] * b[i] - 4 * a[i] * c[i];
			 if (d > 0)
			 {
				x1 = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);

				x2 = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");

			 }
			 if (d == 0)
			 {
				 x1 = x2 = -b[i] / (2 * a[i]);
				 System.out.printf("%.5f", "x1=x2=");
				 System.out.printf("%.5f", x1);
				 System.out.printf("%.5f", "\n");

			 }
			 if (d < 0)
			 {
				 f = 0 - (b[i] / (2 * a[i]));
				 g = Math.sqrt(-d) / (2 * a[i]);
				 System.out.printf("%.5f", "x1=");
				 System.out.printf("%.5f", f);
				 System.out.printf("%.5f", "+");
				 System.out.printf("%.5f", g);
				 System.out.printf("%.5f", "i");
				 System.out.printf("%.5f", ";");
				 System.out.printf("%.5f", "x2=");
				 System.out.printf("%.5f", f);
				 System.out.printf("%.5f", "-");
				 System.out.printf("%.5f", g);
				 System.out.printf("%.5f", "i");
				 System.out.printf("%.5f", "\n");

			 }

		}
		return 0;
	}
}

