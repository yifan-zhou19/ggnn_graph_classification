package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double pan = 0;
		double x1 = 0;
		double x2 = 0;
		double y = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			pan = b * b - 4 * a * c;
			if (pan > 0)
			{
				x1 = (-b + Math.sqrt(pan)) / (2 * a);
				x2 = (-b - Math.sqrt(pan)) / (2 * a);
				System.out.printf("x1=%.5f",x1);
				System.out.printf(";x2=%.5f\n", x2);
			}
			else if (pan == 0)
			{
				x1 = (-b) / (2 * a);
				x2 = x1;
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				x1 = (-b) / (2 * a);
				if (x1 == 0)
				{
					x1 = -x1;
				}
				y = Math.sqrt(-pan);

				System.out.printf("x1=%.5f",x1);
				System.out.printf("+%.5f",y / (2 * a));
				System.out.print("i;");
				System.out.printf("x2=%.5f",x1);
				System.out.printf("%.5f",-(y / (2 * a)));
				System.out.print("i\n");

			}
		}

		return 0;
	}
}

