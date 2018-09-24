package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //?? n ?????
		double a; //?? a,b,c,delta,x1,x2 ?????????
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			if (delta > 0) //??2??
			{
				 x1 = (-b + Math.sqrt(delta)) / (2 * a); //??x1
				 x2 = (-b - Math.sqrt(delta)) / (2 * a); //??x2
				 if (x1 == 0)
				 {
					 x1 = 0;
				 }
				 if (x2 == 0)
				 {
					 x2 = 0;
				 }
				 System.out.printf("%.5f", "x1=");
				 System.out.printf("%.5f", x1);
				 System.out.printf("%.5f", ";x2=");
				 System.out.printf("%.5f", x2);
				 System.out.printf("%.5f", "\n");
			}
			else if (delta == 0) //??2????
			{
				 x1 = -b / (2 * a); //??x
				 if (x1 == 0)
				 {
					 x1 = 0;
				 }
				 System.out.printf("%.5f", "x1=x2=");
				 System.out.printf("%.5f", x1);
				 System.out.printf("%.5f", "\n");
			}
			else
			{
				 x1 = -b / (2 * a); //????
				 if (x1 == 0)
				 {
					 x1 = 0;
				 }
				 x2 = Math.sqrt(-delta) / (2 * a); //???????
				 System.out.printf("%.5f", "x1=");
				 System.out.printf("%.5f", x1);
				 System.out.printf("%.5f", "+");
				 System.out.printf("%.5f", x2);
				 System.out.printf("%.5f", "i");
				 System.out.printf("%.5f", ";x2=");
				 System.out.printf("%.5f", x1);
				 System.out.printf("%.5f", "-");
				 System.out.printf("%.5f", x2);
				 System.out.printf("%.5f", "i");
				 System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

