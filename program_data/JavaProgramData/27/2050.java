package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a;
		double b;
		double c;
		for (int i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double d = b * b - 4 * a * c;
			if (d > 0)
			{
				double x1 = (-b + Math.sqrt(d)) / (2 * a);
				double x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			if (d == 0)
			{
								 double x = (-b) / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x);
				System.out.printf("%.5f", "\n");
			}
			if (d < 0)
			{
				double m;
								 if (b == 0)
								 {
									 m = 0;
								 }
								 if (b != 0)
								 {
									 m = (-b) / (2 * a);
								 }
								 double n = (Math.sqrt(-d)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", m);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", n);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", m);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", n);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

