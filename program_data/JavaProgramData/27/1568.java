package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double n;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (double k = 1 ; k <= n ; k++)
		{
				a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			if (Math.sqrt(b * b - 4 * a * c) > 0)
			{
				System.out.print("x1=");
				System.out.printf("%.5f",x1);
				System.out.print(";");
				System.out.print("x2=");
				System.out.printf("%.5f",x2);
				System.out.print("\n");
			}
			else
			{
				if (Math.sqrt(b * b - 4 * a * c) == 0)
				{
					System.out.print("x1=x2=");
					System.out.printf("%.5f",x1);
					System.out.print("\n");
				}
				else
				{
					System.out.print("x1=");
					if (b == 0)
					{
						System.out.printf("%.5f",(b / (2 * a)));
					}
					else
					{
					System.out.printf("%.5f",(-b / (2 * a)));
					}
					System.out.print("+");
					System.out.printf("%.5f",(Math.sqrt(Math.abs(b * b - 4 * a * c)) / (2 * a)));
					System.out.print("i");
					System.out.print(";");
					System.out.print("x2=");
					if (b == 0)
					{
						System.out.printf("%.5f",(b / (2 * a)));
					}
					else
					{
					System.out.printf("%.5f",(-b / (2 * a)));
					}
					System.out.print("-");
					System.out.printf("%.5f",(Math.sqrt(Math.abs(b * b - 4 * a * c)) / (2 * a)));
					System.out.print("i");
					System.out.print("\n");
				}
			}
		}
			return 0;
	}
}

