package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			double a = 0;
			double b = 0;
			double c = 0;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c == 0)
			{
				System.out.print("x1=x2=");
				System.out.printf("%.5f", -b / (2 * a));
				System.out.printf("%.5f", "\n");
				continue;
			}
			if (b * b - 4 * a * c > 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
				System.out.printf("%.5f", "\n");
				continue;
			}
			if (b * b - 4 * a * c < 0)
			{
				if (b / (2 * a) == 0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", b / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", b / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", -b / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", -b / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				continue;
			}
		}
		return 0;
	}

}

