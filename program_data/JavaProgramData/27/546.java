package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			double a;
			double b;
			double c;
			double d;
			double e;
			double x;
			double y;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c;
			e = -b / 2 / a;
			if (e == -0)
			{
				e = 0;
			}
			if (d > 0)
			{
				x = e + Math.sqrt(d) / 2 / a;
				y = e - Math.sqrt(d) / 2 / a;
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", y);
				System.out.printf("%.5f", "\n");
			}
			if (d == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "\n");
			}
			if (d < 0)
			{
				x = Math.sqrt(-d) / 2 / a;
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", x);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", x);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

