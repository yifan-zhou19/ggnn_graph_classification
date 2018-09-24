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
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c;
			if (Math.abs(d) < 1E-6)
			{
				x1 = -b / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (d < 0)
				{
					x1 = -b / (2 * a);
					if (Math.abs(x1) < 1E-6)
					{
						x1 = Math.abs(x1);
					}
					x2 = Math.sqrt(-d) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "i;");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					x1 = (-b + Math.sqrt(d)) / (2 * a);
					x2 = (-b - Math.sqrt(d)) / (2 * a);
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

