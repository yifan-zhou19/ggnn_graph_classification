package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{ //?????
		int n;
		int i;
		double a; //????
		double b;
		double c;
		double x1;
		double x2;
		double d;
		double p;
		double q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //n???
		{ //????
			  a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			  b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			  c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			  d = b * b - 4 * a * c;
			  p = -b / (2 * a);
			  q = Math.sqrt(Math.abs(d)); //?????????
			  if (d < 0) //?  d<0
			  { //?? d ? 0 ?????
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", p + 1 - 1);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", q / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", p + 1 - 1);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", q / (2 * a));
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
			  }
			  else
			  {
				  if (d == 0) //? d=0
				  {
						 System.out.printf("%.5f", "x1=x2=");
						 System.out.printf("%.5f", p + 1 - 1);
						 System.out.printf("%.5f", "\n");
				  }
				  else //? d>0
				  {
					  System.out.printf("%.5f", "x1=");
					  System.out.printf("%.5f", p + 1 - 1 + q / (2 * a));
					  System.out.printf("%.5f", ";");
					  System.out.printf("%.5f", "x2=");
					  System.out.printf("%.5f", p + 1 - 1 - q / (2 * a));
					  System.out.printf("%.5f", "\n");
				  }
			  }
		}
		 return 0;
	} //?????


}

