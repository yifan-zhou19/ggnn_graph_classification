package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			float a;
			float b;
			float c;
			double x1;
			double x2;
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if ((b * b - 4 * a * c) > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				if (Math.abs(x1) < 1e-5)
				{
					x1 = 0;
				}
				else if (Math.abs(x2) < 1e-5)
				{
					x2 = 0;
				}
				System.out.printf("%f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if ((b * b - 4 * a * c) == 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				if (Math.abs(x1) < 1e-5)
				{
					x1 = 0;
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				double a1;
				double b1;
				a1 = (-b / (2 * a));
				b1 = (Math.sqrt(4 * a * c - b * b) / 2 / a);
				if (Math.abs(a1) <= 1e-5)
				{
					a1 = 0;
				}
				else if (Math.abs(b1) < 1e-5)
				{
					b1 = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", a1);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", b1);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", a1);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", b1);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

