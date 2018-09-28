package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double x1 = 0;
		double x2 = 0;
		double k = 0;
		double e = 0;
		double f = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i = i + 1)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			k = b * b - 4 * a * c;
			if (k > 0)
			{
				x1 = (-b + Math.sqrt(k)) / (2 * a);
				x2 = (-b - Math.sqrt(k)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (k == 0)
			{
				x1 = (-b) / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				e = (-b) / (2 * a);
				f = (Math.sqrt(-k)) / (2 * a);
				if (e == 0)
				{
					System.out.printf("%.5f", "x1=0.00000");
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", f);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=0.00000");
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", f);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", e);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", f);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", e);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", f);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}

			}
		}
		return 0;
	}
}

