package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		if (b * b - 4 * a * c >= 0)
		{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				if (x1 == x2)
				{
						System.out.printf("%.5f", "x1=x2=");
						System.out.printf("%.5f", x1);
						System.out.printf("%.5f", "\n");
				}
				if (x1 != x2)
				{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", x1);
						System.out.printf("%.5f", ";");
						System.out.printf("%.5f", "x2=");
						System.out.printf("%.5f", x2);
						System.out.printf("%.5f", "\n");
				}
		}
		if (b * b - 4 * a * c < 0)
		{
				t = -b / (2 * a);
				if (Math.abs(t) < 1e-6)
				{
					t = Math.abs(t);
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", t);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", (Math.sqrt(-b * b + 4 * a * c)) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", t);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", (Math.sqrt(-b * b + 4 * a * c)) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
		}
		}
		return 0;
	}
}

