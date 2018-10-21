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
		double d;
		double r;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c;
			if (d > 0)
			{
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.print("x1=");
				System.out.printf("%.5f",x1);
				System.out.print(";x2=");
				System.out.printf("%.5f",x2);
				System.out.print("\n");
			}
			else if (d < 0)
			{
				r = -b / (2 * a);
				d = Math.abs(d);
				x1 = Math.sqrt(d) / (2 * a);
				System.out.print("x1=");
				if (r == 0)
				{
					System.out.print("0.00000");
				}
				else
				{
					System.out.printf("%.5f",r);
				}
				System.out.print("+");
				System.out.printf("%.5f",x1);
				System.out.print("i;x2=");
				if (r == 0)
				{
					System.out.print("0.00000");
				}
				else
				{
					System.out.printf("%.5f",r);
				}
				System.out.print("-");
				System.out.printf("%.5f",x1);
				System.out.print("i");
				System.out.print("\n");
			}
			else
			{
				x1 = -b / (2 * a);
				System.out.print("x1=x2=");
				System.out.printf("%.5f",x1);
				System.out.print("\n");
			}
		}

		return 0;
	}
}

