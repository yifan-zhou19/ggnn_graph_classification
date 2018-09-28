package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			double a;
			double b;
			double c;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double delta;
			double x1;
			double x2;
			delta = b * b - 4 * a * c;
			if (delta > 0)
			{
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.print("x1=");
			System.out.printf("%.5f", x1);
			System.out.print(";x2=");
			System.out.printf("%.5f",x2);
			System.out.print("\n");
			}
			else if (delta == 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.print("x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.print("\n");
			}
			else if (delta < 0)
			{
				x1 = (-b) / (2 * a);
				if (x1 > -0.00001 && x1 <= 0)
				{
					x1 = -x1 + 0.0000001;
				}
				double i;
				i = Math.sqrt(-delta) / (2 * a);
				System.out.print("x1=");
				System.out.printf("%.5f", x1);
				System.out.print("+");
				System.out.printf("%.5f", i);
				System.out.print("i;x2=");
							System.out.printf("%.5f", x1);
							System.out.print("-");
							System.out.printf("%.5f", i);
							System.out.print("i");
							System.out.print("\n");
			}

		}
		return 0;
	}

}

