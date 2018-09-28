package <missing>;

public class GlobalMembers
{
	public static double x1;
	public static double x2;
	public static void cal(double a, double b, double c)
	{
		double deta = b * b - 4 * a * c;
		if (deta > 0)
		{
			x1 = (- b + Math.sqrt(deta)) / (2 * a);
			x2 = (- b - Math.sqrt(deta)) / (2 * a);
			System.out.printf("%.5f", "x1=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", ";x2=");
			System.out.printf("%.5f", x2);
			System.out.printf("%.5f", "\n");
		}
		else
		{
			if (deta == 0)
			{
				if (b == 0)
				{
					x1 = 0;
				}
				else
				{
					x1 = - b / (2 * a);
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				x1 = Math.sqrt(-deta) / (2 * a);
				if (b == 0)
				{
					x2 = 0;
				}
				else
				{
					x2 = - b / (2 * a);
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			cal(a, b, c);
		}
		return 0;
	}


}

