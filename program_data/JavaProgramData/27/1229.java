package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double r1;
		double r2;
		double i1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0)
			{
				r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x1 = r1 > r2 != 0?r1:r2;
				x2 = r1 < r2 != 0?r1:r2;
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (b * b - 4 * a * c < 0)
			{
				i1 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", -b / (2 * a));
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Math.abs(i1));
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", -b / (2 * a));
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Math.abs(i1));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
			else
			{
				x1 = -b / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}


}

