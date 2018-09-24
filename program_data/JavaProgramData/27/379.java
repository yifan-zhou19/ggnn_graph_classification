package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????(8.3) ????????? (1051)       
	//*????? 1100012996       **
	//*???2011.9.14                         
	//****************************************
	public static int Main()
	{
		int n; //n????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a; //a?b?c???
		double b;
		double c;
		for (int i = 0;i < n;i++)
		{
			double x1;
			double x2;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			double dot = b * b - 4 * a * c; //???b^2-4ac??
			//?????????????????
			if (dot == 0)
			{
				x1 = x2 = - b / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (dot > 0)
				{
					x1 = (-b + Math.sqrt(dot)) / (2 * a);
					x2 = (-b - Math.sqrt(dot)) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
				else
				{
					if (-b / (2 * a) != 0)
					{
					//????????-0.00000?????
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", -b / (2 * a));
						System.out.printf("%.5f", "+");
						System.out.printf("%.5f", Math.sqrt(-dot) / (2 * a));
						System.out.printf("%.5f", "i;x2=");
						System.out.printf("%.5f", -b / (2 * a));
						System.out.printf("%.5f", "-");
						System.out.printf("%.5f", Math.sqrt(-dot) / (2 * a));
						System.out.printf("%.5f", "i");
						System.out.printf("%.5f", "\n");
					}
					else
					{
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", b / (2 * a));
						System.out.printf("%.5f", "+");
						System.out.printf("%.5f", Math.sqrt(-dot) / (2 * a));
						System.out.printf("%.5f", "i;x2=");
						System.out.printf("%.5f", b / (2 * a));
						System.out.printf("%.5f", "-");
						System.out.printf("%.5f", Math.sqrt(-dot) / (2 * a));
						System.out.printf("%.5f", "i");
						System.out.printf("%.5f", "\n");
					}

				}
			}

		}



		return 0;

	}

}

