package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c;
		if (d > 0)
		{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", ((-b) + Math.sqrt(d)) / (2 * a));
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", ((-b) - Math.sqrt(d)) / (2 * a));
				System.out.printf("%.5f", "\n");
		}
		else if (d == 0)
		{
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", (-b) / (2 * a));
			System.out.printf("%.5f", "\n");
		}
		else
		{
				if (b == 0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", b / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-d) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", b / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-d) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", (-b) / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-d) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", (-b) / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-d) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
		}
		}
		return 0;
	}
}

