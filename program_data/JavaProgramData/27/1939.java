package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double x1;
		double x2;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				if (x1 == 0)
				{
					x1 = 0;
				}
				if (x2 == 0)
				{
					x2 = 0;
				}
				System.out.print("x1=");
				System.out.printf("%.5lf", x1);
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5lf\n", x2);
			}
			else if (b * b - 4 * a * c == 0)
			{
				x1 = - b / (2 * a);
				if (x1 == 0)
				{
					x1 = 0;
				}
				System.out.print("x1=x2=");
				System.out.printf("%.5lf\n",x1);
			}
			else
			{
				double m;
				double n;
				m = Math.sqrt(4 * a * c - b * b) / (2 * a);
				n = - b / (2 * a);
				if (b == 0)
				{
					n = 0;
				}
				System.out.print("x1=");
				System.out.printf("%.5lf", n);
				System.out.print("+");
				System.out.printf("%.5lf", m);
				System.out.print("i");
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5lf", n);
				System.out.print("-");
				System.out.printf("%.5lf", m);
				System.out.print("i");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

