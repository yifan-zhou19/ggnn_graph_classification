package <missing>;

public class GlobalMembers
{
	//**************************************
	//* ???????????? **
	//* ?????? 1300012722 **
	//* ???2013.10.10 **
	//**************************************
	public static int Main()
	{
		int n; //?????????n
		int i = 1;
		double a; //????ax2 + bx + c =0????????????x1?x2?b*b-4*a*c??,-b/(2*a)d??m
		double b;
		double c;
		double x1;
		double x2;
		double delta;
		double m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (i <= n)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c; //??delta??
				if (delta > 0)

				{
					x1 = (0 - b + Math.sqrt(delta)) / (2 * a); //??x1??
					x2 = (0 - b - Math.sqrt(delta)) / (2 * a); //??x2??
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
				else if (delta == 0)
				{
					m = (0 - b) / (2 * a); //??x1?x2??
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", m);
					System.out.printf("%.5f", "\n");
				}

				else if (delta < 0)
				{
					m = (0 - b) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", m);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-delta) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", m);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-delta) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}

			i++; //i???1
		}

		return 0;
	}

}

