package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double xa;
		double ya;
		double yb;
		double yc;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1 ; k <= n ; k++)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			xa = (-b) / (2 * a);
			ya = b * b - 4 * a * c;
			yb = Math.sqrt(ya) / (2 * a);
			yc = Math.sqrt(-ya) / (2 * a);
			x1 = xa + yb;
			x2 = xa - yb;
			if (ya < 0)
			{
				if (xa == 0)
				{
					System.out.print("x1=");
					System.out.printf("%.5f", -xa);
					System.out.print("+");
					System.out.printf("%.5f", yc);
					System.out.print("i;x2=");
					System.out.printf("%.5f", -xa);
					System.out.print("-");
					System.out.printf("%.5f", yc);
					System.out.print("i");
					System.out.print("\n");
				}
				else
				{
					System.out.print("x1=");
					System.out.printf("%.5f", xa);
					System.out.print("+");
					  System.out.printf("%.5f", yc);
					System.out.print("i;x2=");
					System.out.printf("%.5f", xa);
					System.out.print("-");
					System.out.printf("%.5f", yc);
					System.out.print("i");
					System.out.print("\n");
				}
			}
				else
				{
					if (x1 != x2)
					{
						System.out.print("x1=");
						System.out.printf("%.5f", x1);
						System.out.print(";x2=");
						System.out.printf("%.5f", x2);
						System.out.print("\n");
					}
					else
					{
						System.out.print("x1=x2=");
						System.out.printf("%.5f", x1);
						System.out.print("\n");
					}
				}
		}
		return 0;
	}
}

