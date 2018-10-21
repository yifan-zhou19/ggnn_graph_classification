package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		double r;
		double i;
		for (int p = 1;p <= n;p++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			if (delta > 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.print("x1=");
				System.out.printf("%.5f", x1);
				System.out.print(";x2=");
				System.out.printf("%.5f\n",x2);
				System.out.print("\n");
			}
			else
			{
				if (delta == 0)
				{
					x1 = (-b) / (2 * a);
					System.out.print("x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.print("\n");
				}
				else
				{
					r = (-b) / (2 * a);
					delta = -delta;
					i = (Math.sqrt(delta)) / (2 * a);
					if (r == 0)
					{
						r = Math.abs(r);
					}
					System.out.print("x1=");
					System.out.printf("%.5f",r);
					System.out.print("+");
					System.out.printf("%.5f",i);
					System.out.print("i;x2=");
					System.out.printf("%.5f",r);
					System.out.print("-");
					System.out.printf("%.5f",i);
					System.out.print("i");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

