package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		double t;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			x1 = x2 = t = 0.0;
			d = b * b - 4 * a * c;
			if (Math.abs(d) < 1E-6)
			{
				x1 = -1 * b / (2 * a);
				if (Math.abs(x1) < 1E-6)
				{
					x1 = Math.abs(x1);
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (d < 0)
				{
					x1 = -1 * b / (2 * a);
					if (Math.abs(x1) < 1E-6)
					{
						x1 = Math.abs(x1);
					}
					t = Math.sqrt(Math.abs(d)) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", t);
					System.out.printf("%.5f", "i;");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", t);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					t = Math.sqrt(d) / (2 * a);
					x1 = -1 * b / (2 * a) + t;
					x2 = -1 * b / (2 * a) - t;
					if (Math.abs(x1) < 1E-6)
					{
						x1 = Math.abs(x1);
					}
					if (Math.abs(x2) < 1E-6)
					{
						x2 = Math.abs(x2);
					}
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
			}
		}





		return 0;

	}

}

