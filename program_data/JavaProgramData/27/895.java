package <missing>;

public class GlobalMembers
{
	//***********************************
	//*	  ????6.cpp					*
	//*   ?????					*
	//*   ???2013.10.9				*
	//*	  ????????????      *
	//***********************************
	public static int Main()
	{
		int n;
		int i;
		double root1;
		double root2;
		double a;
		double b;
		double c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
				a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				if (b * b - 4.0 * a * c > 0)
				{
					root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", root1);
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", root2);
					System.out.printf("%.5f", "\n");
				}
				else if (b * b - 4.0 * a * c == 0)
				{
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", -b / (2 * a));
					System.out.printf("%.5f", "\n");
				}
				else
				{
					if (b == 0.0)
					{
						b = -b;
					}
					root1 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
					root2 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", -b / (2 * a));
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", root1);
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", -b / (2 * a));
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", root2);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
		}
		return 0;
	}


}

