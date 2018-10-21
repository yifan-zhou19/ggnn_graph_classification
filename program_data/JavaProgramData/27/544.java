package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a;
		double b;
		double c;
		for (i = 1;i <= n;i++)
		{
						  a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						  b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						  c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						  if (b * b - 4 * a * c >= 0)
						  {

										  double x1;
										  double x2;
										  x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
										  x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
										  if (x1 == x2)
										  {
											  System.out.printf("x1=x2=%.5f\n", x1);
										  }
										  else
										  {
											  System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
										  }
						  }
						  else
						  {
							  double x11;
							  double x12;
							  double x21;
							  double x22;
							  x11 = (-b) / (2 * a);
							  x12 = +Math.sqrt(-b * b + 4 * a * c) / (2 * a);
							  x21 = (-b) / (2 * a);
							  x22 = -Math.sqrt(-b * b + 4 * a * c) / (2 * a);
							  if (b == 0)
							  {
								  System.out.printf("x1=0.00000+%.5fi;x2=0.00000%.5fi\n",x12,x22);
							  }
							  else
							  {
								  System.out.printf("x1=%.5f+%.5fi;x2=%.5f%.5fi\n",x11,x12,x21,x22);
							  }
						  }
		}
		return 0;
	}
}

