package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double x1;
		double x2;
		double a;
		double b;
		double c;
		double i;
		double delta;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			if (delta == 0)
			{
				x1 = x2 = (double)(- b / (2 * a));
				System.out.printf("x1=x2=%.5lf\n", x1);
			}
			else if (delta > 0)
			{
				x1 = (double)(-b + Math.sqrt(delta)) / (2 * a);
				x2 = (double)(-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
			}
			else if (delta < 0)
			{
				delta = - delta;
				double i;
				double x;
				i = Math.sqrt(delta) / (2 * a);
				x = -b / (2 * a);
				if (x == - 0)
				{
					x = 0;
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", x, i, x, i);
			}
		}
		return 0;
	}
}

