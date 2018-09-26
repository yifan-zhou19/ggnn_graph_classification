package <missing>;

public class GlobalMembers
{
	public static void coutnoneg(double a)
	{
		if (a == 0)
		{
			System.out.print(0.0);
		}
		else
		{
			System.out.print(a);
		}
	}
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		for ((n;n--; = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
		  a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  d = b * b - 4 * a * c;
		  if (d > 0)
		  {
			 x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			 x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			 System.out.printf("%.5f", "x1=");
			 coutnoneg(x1);
			 System.out.printf("%.5f", ";x2=");
			 coutnoneg(x2);
		  }
		  if (d == 0)
		  {
			  x1 = (-1 * b) / (2 * a);
			  System.out.printf("%.5f", "x1=x2=");
			  coutnoneg(x1);
		  }
		  else if (d < 0)
		  {
			x1 = (-b) / (2 * a);
			x2 = Math.sqrt(-d) / (2 * a);
			System.out.printf("%.5f", "x1=");
			coutnoneg(x1);
			System.out.printf("%.5f", '+');
			coutnoneg(x2);
			System.out.printf("%.5f", "i");
			System.out.printf("%.5f", ";x2=");
			coutnoneg(x1);
			System.out.printf("%.5f", '-');
			coutnoneg(x2);
			System.out.printf("%.5f", "i");
		  }
	System.out.printf("%.5f", "\n");
		}
	return 0;
	}
}

