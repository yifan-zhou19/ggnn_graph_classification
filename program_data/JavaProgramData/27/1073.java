package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???2013?10?11?                  *
	//*??????                          *
	//*????????????              *
	//****************************************

	public static int Main()

	{
		int n; //??????n????i
		int i;
		double a; //????a?b?c??x1?x2???x3???x
		double b;
		double c;
		double x1;
		double x2;
		double x3;
		double x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++) //i?1???n
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); //??x1
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); //??x2

			if ((b * b - 4 * a * c) >= 0) //???????0
			{
				if (x1 == x2) //???????
				{
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "\n");
				}
				if (x1 != x2) //???????
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
			}
			else //???????0
			{
				x3 = (+ Math.sqrt(4 * a * c - b * b)) / (2 * a); //????x3
				x = - b / (2 * a); //????
				if (x == -0) //?????-0
				{
					x = - x; //?????0
				}

				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", x3);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", x3);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
				//??5????x1?x2
			}
		}
		return 0;
	}









}

