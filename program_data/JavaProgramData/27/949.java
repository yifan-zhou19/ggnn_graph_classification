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
		double x1;
		double x2;
		double panDuan;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			panDuan = b * b - 4 * a * c;
			if (panDuan > 0)
			{
				x1 = (-b + Math.sqrt(panDuan)) / (2 * a);
				x2 = (-b - Math.sqrt(panDuan)) / (2 * a);
				if ((x1 >= 0.00001) || (x1 <= -0.00001))
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";");
				}
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", ";");
				}
				if ((x2 >= 0.00001) || (x2 <= -0.00001))
				{
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
				else
				{
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", "0.00000");
					System.out.printf("%.5f", "\n");
				}

			}


			else
			{
				if (panDuan < 0)
				{
					double shiBu;
					double xuBu;
					 shiBu = (-b) / (2 * a);
					xuBu = Math.sqrt(-panDuan) / (2 * a);
					if ((shiBu >= 0.00001) || (shiBu <= -0.00001))
					{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", shiBu);
						System.out.printf("%.5f", "+");
						System.out.printf("%.5f", xuBu);
						System.out.printf("%.5f", "i;");
						System.out.printf("%.5f", "x2=");
						System.out.printf("%.5f", shiBu);
						System.out.printf("%.5f", "-");
						System.out.printf("%.5f", xuBu);
						System.out.printf("%.5f", "i");
						System.out.printf("%.5f", "\n");
					}
					else
					{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", "0.00000+");
						System.out.printf("%.5f", xuBu);
						System.out.printf("%.5f", "i;");
						System.out.printf("%.5f", "x2=");
						System.out.printf("%.5f", "0.00000-");
						System.out.printf("%.5f", xuBu);
						System.out.printf("%.5f", "i");
						System.out.printf("%.5f", "\n");
					}
				}
				else
				{
					double x = (-b) / (2 * a);
					if ((x >= 0.00001) || (x <= -0.00001))
					{
						System.out.printf("%.5f", "x1=x2=");
						System.out.printf("%.5f", x);
						System.out.printf("%.5f", "\n");
					}
					else
					{
						System.out.printf("%.5f", "x1=x2=");
						System.out.printf("%.5f", 0.00000);
						System.out.printf("%.5f", "\n");
					}
				}
			}
		}
			return 0;
	}
}

