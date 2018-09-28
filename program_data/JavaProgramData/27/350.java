package <missing>;

public class GlobalMembers
{
	//****************************************
	//*????????????                                  **
	//*??????  1100012927       **
	//*???2011.09.16                          **
	//****************************************

	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		double x1r;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			if (delta > 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1=%.5f",x1);
				System.out.print(";");
				System.out.printf("x2=%.5f",x2);
				System.out.print("");
				System.out.print("\n");
			}
			else if (delta == 0)
			{
				x1 = (b) / (2 * a);
				System.out.printf("x1=x2=%.5f",-x1);
				System.out.print("");
				System.out.print("\n");
			}
			else if (delta < 0)
			{
				delta = -delta;
				x1 = (Math.sqrt(delta)) / (2 * a);
				x2 = (-Math.sqrt(delta)) / (2 * a);
				x1r = (-b) / (2 * a);
				if (x1r == 0)
				{
					System.out.printf("x1=%.5f+",(-x1r));
				System.out.printf("%.5fi",x1);
				System.out.print(";");
				System.out.printf("x2=%.5f",(-x1r));
				System.out.printf("%.5fi",x2);
					System.out.print("");
					System.out.print("\n");
				}
				else
				{
					System.out.printf("x1=%.5f+",(x1r));
					System.out.printf("%.5fi",x1);
					System.out.print(";");
					System.out.printf("x2=%.5f",(x1r));
					System.out.printf("%.5fi",x2);
					System.out.print("");
					System.out.print("\n");
				}
			}

			n = n - 1;
		}while (n >= 1);
		return 0;
	}

}

