package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double k;
		double s;
		double l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c >= 0)
			{
				k = Math.sqrt(b * b - 4 * a * c);
				if (k == 0)
				{
					if (b == 0)
					{
						s = 0;
					}
					else
					{
						s = -b / (2 * a);
					}
					System.out.printf("%.5f", "\nx1=x2=");
					System.out.printf("%.5f", s);
				}
				else
				{
					s = (-b + k) / (2 * a);
					l = (-b - k) / (2 * a);
					System.out.printf("%.5f", "\nx1=");
					System.out.printf("%.5f", s);
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", l);
				}
			}
			else
			{
				k = Math.sqrt(4 * a * c - b * b);
				if (b == 0)
				{
					s = 0;
				}
				else
				{
					s = -b / (2 * a);
				}
				l = k / (2 * a);
				System.out.printf("%.5f", "\nx1=");
				System.out.printf("%.5f", s);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", l);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", s);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", l);
				System.out.printf("%.5f", "i");
			}
		}
		return 0;
	}
}

