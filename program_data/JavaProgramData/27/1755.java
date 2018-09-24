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
		for (int i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (b * b - 4 * a * c == 0)
			{
				x1 = (-b) / (2 * a);
				x2 = (-b) / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (b == 0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", (0) / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", (0) / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", (-b) / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", (-b) / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}

			}
		}
		return 0;
	}
}

