package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double m;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double h;
		double j;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;m <= n;m++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				if (-0.000001 < x1 && x1 < 0)
				{
					x1 = 0.00000;
				}
				if (-0.000001 < x2 && x2 < 0)
				{
					x2 = 0.00000;
				}
				System.out.print("x1=");
				System.out.printf("%.5f",x1);
				System.out.print(";x2=");
				System.out.printf("%.5f",x2);
				System.out.print("\n");
			}
			else if (b * b - 4 * a * c == 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				if (-0.000001 < x2 && x2 < 0)
				{
					x2 = 0.00000;
				}
				System.out.print("x1=x2=");
				System.out.printf("%.5f",x1);
				System.out.print("\n");
			}
			else
			{
				h = -b / (2 * a);
				j = Math.sqrt(4 * a * c - b * b) / (2 * a);
				if (h == -0.00000)
				{
					h = 0.00000;
				}
				if (j == -0.00000)
				{
					j = 0.00000;
				}
				System.out.print("x1=");
				System.out.printf("%.5f",h);
				System.out.print("+");
				System.out.printf("%.5f",j);
				System.out.print("i");
				System.out.print(";x2=");
				System.out.printf("%.5f",h);
				System.out.print("-");
				System.out.printf("%.5f",j);
				System.out.print("i");
				System.out.print("\n");


			}
		}
				return 0;

	}


}

