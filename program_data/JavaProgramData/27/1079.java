package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			float a;
			float b;
			float c;
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			double delta = b * b - 4 * a * c;
			if (delta > 0)
			{
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				if (x1 == -0.0)
				{
					x1 = 0.0;
				}
				if (x2 == -0.0)
				{
					x2 = 0.0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
				continue;
			}
			if (delta == 0)
			{
				double x = -b / (2 * a);
				if (x == -0.0)
				{
					x = 0.0;
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x);
				System.out.printf("%.5f", "\n");
				continue;
			}
			if (delta < 0)
			{
				double re = -b / (2 * a);
				double im = Math.sqrt(-delta) / (2 * a);
				if (re == -0.0)
				{
					re = 0.0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", re);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", im);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", re);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", im);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		 return 0;
	}
}

