package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double a; //delta ????
		double b;
		double c;
		double delta;
		double x1; //??x1i,x2i
		double x2;
		double x1i;
		double x2i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ; i <= n ; i++)
		{
			 a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 delta = b * b - 4 * a * c;
			 if (delta > 0)
			 {
				 x1 = (-b + Math.sqrt(delta)) / (2 * a);
				 x2 = (-b - Math.sqrt(delta)) / (2 * a);
				 System.out.printf("%.5f", "x1=");
				 System.out.printf("%.5f", ((Math.abs(x1) < 10e-5)? 0:x1));
				 System.out.printf("%.5f", ";");
				 System.out.printf("%.5f", "x2=");
				 System.out.printf("%.5f", ((Math.abs(x2) < 10e-5)? 0:x2));
				 System.out.printf("%.5f", '\n');
			 }
			 else if (delta == 0) //??delta=0 ?????
			 {
				 x1 = x2 = -b / (2 * a);
				 System.out.printf("%.5f", "x1=x2=");
				 System.out.printf("%.5f", ((Math.abs(x1) < 10e-5)? 0:x1));
				 System.out.printf("%.5f", "\n");
			 }
			 else //delta<0?????
			 {
				 x1 = -b / (2 * a);
				 x2 = -b / (2 * a);
				 x1i = Math.sqrt(-delta) / (2 * a);
				 x2i = Math.sqrt(-delta) / (2 * a);
				 System.out.printf("%.5f", "x1=");
				 System.out.printf("%.5f", ((Math.abs(x1) < 10e-5)? 0:x1));
				 System.out.printf("%.5f", "+");
				 System.out.printf("%.5f", x1i);
				 System.out.printf("%.5f", "i");
				 System.out.printf("%.5f", ";");
				 System.out.printf("%.5f", "x2=");
				 System.out.printf("%.5f", ((Math.abs(x1) < 10e-5)? 0:x1));
				 System.out.printf("%.5f", "-");
				 System.out.printf("%.5f", x2i);
				 System.out.printf("%.5f", "i");
				 System.out.printf("%.5f", "\n");

			 }
		}
	return 0;
	}

}

