package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double m;
		double n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ; i <= k ; i++)
		{
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		if (b * b - 4 * a * c == 0)
		{
			System.out.printf("%.5f", "x1=x2=");
			System.out.printf("%.5f", (-b) / (2 * a));
			System.out.printf("%.5f", "\n");
		}
		else
		{
			if (b * b - 4 * a * c > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else
			{

				m = (-b) / (2 * a);
				n = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
				if (m != 0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", m);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", n);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", m);
					System.out.printf("%.5f", -n);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", n);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", -n);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}


			}
		}
		}
		return 0;
	}

}

