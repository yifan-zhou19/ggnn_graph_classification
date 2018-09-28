package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0)
			{
				   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				if (x1 == -0)
				{
					x1 = 0;
				}
				if (x2 == -0)
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
			if (b * b - 4 * a * c == 0)
			{
				x1 = (-b) / (2 * a);
				if (x1 == -0)
				{
					x1 = 0;
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			if (b * b - 4 * a * c < 0)
			{
				x1 = (-b) / (2 * a);
				x2 = Math.sqrt(4 * a * c - b * b) / (2 * a);
				if (x1 == -0)
				{
					x1 = 0;
				}
				if (x2 == -0)
				{
					x2 = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

