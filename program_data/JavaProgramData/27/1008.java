package <missing>;

public class GlobalMembers
{
	/****************
	??cpp1
	???
	2013/10/10
	??(8.3) ????????? (1051)
	***************/
	public static int Main()
	{
		int i;
		int n;
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++) //?1?n????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c; // ????
			if (d == 0) //????????
			{
				x1 = -b / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else if (d > 0) //?????????
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
			else //?????????
			{
				if (b == 0)
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", (b / (2 * a)));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", (b / (2 * a)));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else
				{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", (-b / (2 * a)));
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", (-b / (2 * a)));
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
				}
			}
		}
		return 0;
	}

}

