package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	double a;
	double b;
	double c;
	double j;
	double x1;
	double x2;
	double m;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	do
	{
		n--;
	a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	m = (-b) / (2 * a);
	j = b * b - 4 * a * c;
	if (x1 < 0.00001 && x1>-0.00001)
	{
		x1 = 0;
	}
	if (x2 < 0.00001 && x2>-0.00001)
	{
		x2 = 0;
	}
		 if (j > 0)
		 {
			 System.out.printf("%.5f", "x1=");
			 System.out.printf("%.5f", x1);
			 System.out.printf("%.5f", ";x2=");
			 System.out.printf("%.5f", x2);
			 System.out.printf("%.5f", "\n");
		 }
			else if (j == 0)
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
					else
					{
						if (m < 0.00001 && m>-0.00001)
						{
							m = 0;
						}
						 System.out.printf("%.5f", "x1=");
						 System.out.printf("%.5f", m);
						 System.out.printf("%.5f", "+");
						 System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
						 System.out.printf("%.5f", "i");
						 System.out.printf("%.5f", ";x2=");
						 System.out.printf("%.5f", m);
						 System.out.printf("%.5f", "-");
						 System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
						 System.out.printf("%.5f", "i");
						 System.out.printf("%.5f", "\n");
					}
	}while (n >= 1);
	return 0;
	}
}

