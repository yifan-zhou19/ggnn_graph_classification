package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		double img;
		double rl;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			if (delta > 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (delta == 0)
			{
				x1 = (-b) / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				img = Math.sqrt(-delta) / (2 * a);
				rl = (-b) / (2 * a);
				if (rl != 0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", rl);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", img);
					System.out.printf("%.5f", "i;");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", rl);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", img);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", img);
					System.out.printf("%.5f", "i;");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", img);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
			}
		}
		return 0;
	}
}

