package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double n;
		double i;
		double panbieshi;
		double x1;
		double x2;
		double d;
		double e;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			panbieshi = b * b - 4 * a * c;
			if (panbieshi > 0)
			{
				x1 = (- b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
				x2 = (- b - Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
				System.out.print("x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			if (panbieshi == 0)
			{
				x1 = (- b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			if (panbieshi < 0)
			{
				d = (- b) / (2.0 * a);
				e = Math.sqrt(- b * b + 4.0 * a * c) / (2.0 * a);
				if (d == -0)
				{
					d = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

