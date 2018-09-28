package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int o;
	   int g;
	   double a;
	   double b;
	   double c;
	   double d;
	   double x1;
	   double x2;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (o = 1;o <= n;o++)
	   {
		   a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   if (a < 0)
		   {
			   a = 0 - a;
			   b = 0 - b;
			   c = 0 - c;
		   }
		 d = b * b - 4 * a * c;
		 if (d > 0)
		 {
			 g = 2;
		 }
		 else if (d < 0)
		 {
			 g = 0;
			 d = 0 - d;
		 }
		 else
		 {
			 g = 1;
		 }
		 if (g == 1)
		 {
			 x1 = -b / (2 * a);
			 System.out.print("x1=x2=");
			 System.out.printf("%.5f",x1);
			 System.out.print("\n");
		 }
		 else if (g == 2)
		 {
			 x1 = (Math.sqrt(d) - b) / (2 * a);
			 x2 = (-Math.sqrt(d) - b) / (2 * a);
			 System.out.print("x1=");
			 System.out.printf("%.5f",x1);
			 System.out.print(";x2=");
			 System.out.printf("%.5f",x2);
			 System.out.print("\n");
		 }
		 else
		 {
			 x1 = Math.sqrt(d) / (2 * a);
			 System.out.print("x1=");
			 System.out.printf("%.5f",-b / (2 * a));
			 System.out.print("+");
			 System.out.printf("%.5f",x1);
			 System.out.print("i;x2=");
					  System.out.printf("%.5f",-b / (2 * a));
					  System.out.print("-");
					  System.out.printf("%.5f",x1);
					  System.out.print("i");
					  System.out.print("\n");
		 }
	   }
	   return 0;
	}

}

