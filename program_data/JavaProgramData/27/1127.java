package <missing>;

public class GlobalMembers
{
	/**
	????6
	?  ?????
	?  ??10.12
	?  ???????????
	*/


	public static int Main()
	{
		int n; // ?????????n
		double a; // ????????a,b,c
		double b;
		double c;
		double x1; // ????????x1,x2
		double x2;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1 ; i <= n ; i++) // ????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c < 0) // ????????
			{
				// ????????????????�i�???

				if (b != 0)
				{
				 System.out.printf("%f", "x1=");
				 System.out.printf("%.5f", -b / (2 * a));
				 System.out.printf("%.5f", "+");
				  System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
				  System.out.printf("%.5f", "i;");
				 System.out.printf("%.5f", "x2=");
				 System.out.printf("%.5f", -b / (2 * a));
				 System.out.printf("%.5f", "-");
				 System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
				 System.out.printf("%.5f", "i");
				 System.out.printf("%.5f", "\n");
				}
				//???????????????????????
				if (b == 0)
				{
				 System.out.printf("%.5f", "x1=");
				 System.out.printf("%.5f", b / (2 * a));
				 System.out.printf("%.5f", "+");
				  System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
				  System.out.printf("%.5f", "i;");
				 System.out.printf("%.5f", "x2=");
				 System.out.printf("%.5f", b / (2 * a));
				 System.out.printf("%.5f", "-");
				 System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
				 System.out.printf("%.5f", "i");
				 System.out.printf("%.5f", "\n");
				}
			}
			 if (b * b - 4 * a * c == 0)
			 {
				x1 = -b / (2 * a);

				// ?????0??x1,x2??
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			 }

			 if (b * b - 4 * a * c > 0)
			 {
				 x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

				// ????????????x1,x2
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			 }
		}
		return 0;
	}
}

