package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  double a;
	  double b;
	  double c;
	  double delta;
	  for (int i = 1; i <= n ;++i)
	  {
			 a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 delta = b * b - 4 * a * c;
			 if (delta == 0)
			 {
			   System.out.print("x1=x2=");
			   System.out.printf("%.5f", (-b) / (2 * a));
			 }
			 if (delta > 0)
			 {
						 System.out.print("x1=");
						 System.out.printf("%.5f", (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
						 System.out.print(";x2=");
						 System.out.printf("%.5f", (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			 }
			 if (delta < 0)
			 {
						 delta = -delta;
						 double shi;
						 double xu;
						 shi = (-b) / (2 * a);
						 xu = (Math.sqrt(delta)) / (2 * a);
						 if (shi == 0)
						 {
							 shi = 0;
						 }
						 System.out.print("x1=");
						 System.out.printf("%.5f", shi);
						 System.out.print("+");
						 System.out.printf("%.5f", xu);
						 System.out.print("i;");
						 System.out.print("x2=");
						 System.out.printf("%.5f", shi);
						 System.out.print("-");
						 System.out.printf("%.5f", xu);
						 System.out.print("i");
			 }
			 System.out.print("\n");
	  }
	  return 0;
	}
}

