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
		double x;
		double y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0)
			{
				x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				y = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.print("x1=");
				System.out.printf("%.5lf",x);
				System.out.print(";x2=");
				System.out.printf("%.5lf\n",y);
			}
			else if (b * b - 4 * a * c == 0)
			{
				x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.print("x1=x2=");
				System.out.printf("%.5lf\n",x);
			}
			else
			{
				x = (Math.sqrt(-b * b + 4 * a * c)) / (2 * a);
				if (b != 0)
				{
					y = (-b) / (2 * a);
				}
				else
				{
					y = 0;
				}
				System.out.print("x1=");
				System.out.printf("%.5lf",y);
				System.out.print("+");
				System.out.printf("%.5lf",x);
				System.out.print("i;x2=");
				System.out.printf("%.5lf",y);
				System.out.print("-");
				System.out.printf("%.5lf",x);
				System.out.print("i");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

