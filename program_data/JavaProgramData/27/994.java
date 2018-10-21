package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double t;
		double i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k = k + 1) //circulating
		{
			   a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			   b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			   c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			   t = b * b - 4 * a * c;

			   if (t == 0)
			   {
				   x1 = (-b + Math.sqrt(t)) / (2 * a);
				   x2 = (-b - Math.sqrt(t)) / (2 * a);
				   System.out.printf("%.5f", "x1");
				   System.out.printf("%.5f", "=");
				   System.out.printf("%.5f", "x2");
				   System.out.printf("%.5f", "=");
				   System.out.printf("%.5f", x1);
				   System.out.printf("%.5f", "\n");
			   }
			   if (t > 0)
			   {
				   x1 = (-b + Math.sqrt(t)) / (2 * a);
				   x2 = (-b - Math.sqrt(t)) / (2 * a);
				   System.out.printf("%.5f", "x1");
				   System.out.printf("%.5f", "=");
				   System.out.printf("%.5f", x1);
				   System.out.printf("%.5f", ";");
				   System.out.printf("%.5f", "x2");
				   System.out.printf("%.5f", "=");
				   System.out.printf("%.5f", x2);
				   System.out.printf("%.5f", "\n");
			   }
			   if (t < 0)
			   {
				   x1 = (-b) / (2 * a);
				   x2 = (-b) / (2 * a);
				   i = Math.sqrt(-t) / (2 * a);
				   if (x1 >= -0.000001 && x1 <= 0.0000001)
				   {
					   x1 = x2 = 0.00; //if x is a number which approximately approach 0(set the range of its presicion!), we can output 0 instead of x.
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

