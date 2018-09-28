package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (m = 1;m <= n;m++) //?????
	{
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		 if ((b * b - 4 * a * c) > 0) //???????
		 {
			 x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			 x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			 System.out.printf("%.5f", "x1");
			 System.out.printf("%.5f", "=");
			 System.out.printf("%.5f", x1);
			 System.out.printf("%.5f", ";");
			 System.out.printf("%.5f", "x2");
			 System.out.printf("%.5f", "=");
			 System.out.printf("%.5f", x2);
			 System.out.printf("%.5f", "\n");
		 }
		 if ((b * b - 4 * a * c) == 0) //???????
		 {
			x1 = x2 = (-b) / (2 * a);
			System.out.printf("%.5f", "x1");
			System.out.printf("%.5f", "=");
			System.out.printf("%.5f", "x2");
			System.out.printf("%.5f", "=");
			System.out.printf("%.5f", x2);
			System.out.printf("%.5f", "\n");
		 }
		 if ((b * b - 4 * a * c) < 0) //???????
		 {
			 x1 = x2 = (-b) / (2 * a);
			 i = Math.abs(Math.sqrt(4 * a * c - b * b) / (2 * a));
			 if (x1 > (-0.000001) && x2 < 0.000001)
			 {
				 x1 = x2 = 0;
			 }
			System.out.printf("%.5f", "x1");
			System.out.printf("%.5f", "=");
			System.out.printf("%.5f", x1);
			System.out.printf("%.5f", "+");
			System.out.printf("%.5f", i);
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", ";");
			System.out.printf("%.5f", "x2");
			System.out.printf("%.5f", "=");
			System.out.printf("%.5f", x2);
			System.out.printf("%.5f", "-");
			System.out.printf("%.5f", i);
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", "\n");
		 }
	}
	 return 0;
	}
}

