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
	  double delta;
	  double x1;
	  double x2;
	  double x11;
	  double x12;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1;i <= n;i++)
	  {
		  a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		delta = b * b - 4 * a * c; //?????
		if (delta == 0) //????0????????
		{
			x1 = (-b / (2 * a));
		  System.out.printf("%.5f", "x1=x2=");
		  System.out.printf("%.5f", x1);
		  System.out.printf("%.5f", "\n");
		}
		else if (delta > 0) //?????????????
		{
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
		  x2 = (-b - Math.sqrt(delta)) / (2 * a);
		  System.out.printf("%.5f", "x1=");
		  System.out.printf("%.5f", x1);
		  System.out.printf("%.5f", ";x2=");
		  System.out.printf("%.5f", x2);
		  System.out.printf("%.5f", "\n");
		}
		else //???????????
		{
			delta = -delta;
		  x11 = (-b / (2 * a));
		  if (Math.abs(x11) < 0.00001)
		  {
			  x11 = Math.abs(x11);
		  }
		  x12 = (Math.sqrt(delta)) / (2 * a);
		  x12 = Math.abs(x12);
		  System.out.printf("%.5f", "x1=");
		  System.out.printf("%.5f", x11);
		  System.out.printf("%.5f", '+');
		  System.out.printf("%.5f", x12);
		  System.out.printf("%.5f", "i;x2=");
		  System.out.printf("%.5f", x11);
		  System.out.printf("%.5f", '-');
		  System.out.printf("%.5f", x12);
		  System.out.printf("%.5f", 'i');
		  System.out.printf("%.5f", "\n");
		}
	  }
	  return 0;
	}

}

