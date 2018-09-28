package <missing>;

public class GlobalMembers
{
	//*4.cpp???e??  **
	//*????? 1300012896 **
	//*???2013.10.9 *
	//********************************




	public static int Main()
	{
		int n;
		int k;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double D;
		double d;
		double e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
				a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			D = b * b - 4 * a * c;
			if (b != 0)
			{
				b = -b;
			}
			if (D > 0)
			{
				   x1 = (double)(b + Math.sqrt(D)) / (2 * a);
				x2 = (double)(b - Math.sqrt(D)) / (2 * a);
				System.out.printf("%f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (D < 0)
			{
				   d = (double)(b) / (2 * a);
				e = (double)Math.sqrt(-D) / (2 * a);
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

			else
			{
					 x1 = (double)(b + Math.sqrt(D)) / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}

		}
		return 0;
	}

}

