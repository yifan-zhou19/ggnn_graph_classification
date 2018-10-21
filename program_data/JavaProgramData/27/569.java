package <missing>;

public class GlobalMembers
{
	//?????????
	public static int Main()
	{
		int n = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			double a = 0;
			double b = 0;
			double c = 0;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double d = b * b - 4 * a * c;
			double x1 = 0;
			double x2 = 0;
			double r = 0;
			double t = 0;
			if (d >= 0)
			{
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				if (x1 == x2)
				{
					System.out.print("x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
			}
			else
			{
				d = - d;
				r = - b / (2 * a);
				if (r == 0)
				{
					r = 0;
				}
				t = Math.sqrt(d) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", r);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", t);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", r);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", t);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}


}

