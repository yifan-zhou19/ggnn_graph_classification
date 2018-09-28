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
		double x;
		double y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  float m;
		  m = b * b - 4 * a * c;
		  if (m == 0F)
		  {
			  x = -b / (2 * a);
			  System.out.printf("%.5f", "x1=x2=");
			  System.out.printf("%.5f", x);
			  System.out.printf("%.5f", "\n");
		  }
		  else
		  {
			  if (m > 0F)
			  {
				  x1 = (-b + Math.sqrt(m)) / (2 * a);
			   x2 = (-b - Math.sqrt(m)) / (2 * a);
			   System.out.printf("%.5f", "x1=");
			   System.out.printf("%.5f", x1);
			   System.out.printf("%.5f", ";");
			   System.out.printf("%.5f", "x2=");
			   System.out.printf("%.5f", x2);
			   System.out.printf("%.5f", "\n");
			  }
			  else
			  {
				  if (b == 0)
				  {
					  x = b / (2 * a);
			   y = Math.sqrt(-m) / (2 * a);
			   System.out.printf("%.5f", "x1=");
			   System.out.printf("%.5f", x);
			   System.out.printf("%.5f", "+");
			   System.out.printf("%.5f", y);
			   System.out.printf("%.5f", "i;x2=");
			   System.out.printf("%.5f", x);
			   System.out.printf("%.5f", "-");
			   System.out.printf("%.5f", y);
			   System.out.printf("%.5f", "i");
			   System.out.printf("%.5f", "\n");
				  }
			  else
			  {
				  x = -b / (2 * a);
			   y = Math.sqrt(-m) / (2 * a);
			   System.out.printf("%.5f", "x1=");
			   System.out.printf("%.5f", x);
			   System.out.printf("%.5f", "+");
			   System.out.printf("%.5f", y);
			   System.out.printf("%.5f", "i;x2=");
			   System.out.printf("%.5f", x);
			   System.out.printf("%.5f", "-");
			   System.out.printf("%.5f", y);
			   System.out.printf("%.5f", "i");
			   System.out.printf("%.5f", "\n");
			  }
			  }
		  }
		}
		return 0;
	}


}

