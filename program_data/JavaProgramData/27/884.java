package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????   **
	//*????? 1300012707 **
	//*???2013.10.9  **
	//********************************
	public static int Main()
	{
		double a;
		double b;
		double c;
		double r1;
		double r2;
		double x1;
		double x2;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i = i + 1)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b == 0)
			{
				b = -b;
			}
			if ((b * b - 4 * a * c) > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.print("x1=");
				System.out.printf("%.5f", x1);
				System.out.print(";x2=");
				System.out.printf("%.5f", x2);
				System.out.print("\n");
			}
			else
			{
				if ((b * b - 4 * a * c) < 0)
				{
					r1 = -b / (2 * a);
					r2 = Math.sqrt(4 * a * c - b * b) / (2 * a);
					System.out.print("x1=");
					System.out.printf("%.5f", r1);
					System.out.print("+");
					System.out.printf("%.5f", r2);
					System.out.print("i;x2=");
					System.out.printf("%.5f", r1);
					System.out.print("-");
					System.out.printf("%.5f", r2);
					System.out.print("i");
					System.out.print("\n");
				}
				else
				{
					r1 = -b / (2 * a);
					System.out.print("x1=x2=");
					System.out.printf("%.5f", r1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

