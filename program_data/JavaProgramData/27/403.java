package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0 ; k < num ; k++)
		{
			double a;
			double b;
			double c;
			double x1;
			double x2;
			double sb;
			double xb;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			sb = -b / (2 * a);
			xb = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
			if (Math.abs(sb) < 0.000001)
			{
				sb = 0;
			}
			if ((b * b - 4 * a * c) >= 0)
			{
				if (x1 == x2)
				{
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
			}
			else
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", sb);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", xb);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", sb);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", xb);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

