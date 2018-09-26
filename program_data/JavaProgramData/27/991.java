package <missing>;

public class GlobalMembers
{
	//********************************
	//*???6.cpp   **
	//*????????????**
	//*????? 1300012844 **
	//*???2013.10.9  **
	//********************************

	public static int Main()
	{
		 int n; //????????n
		double x1; //?????x1?x2
		double x2;
		double a; //???????a?b?c????delta
		double b;
		double c;
		double delta;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; i++)
		{
			 a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			delta = b * b - 4 * a * c; //?????delta

			if (delta > 0) //??delta??????????
			{ //??????x1,x2????0??-0?????
						x1 = 0 + (-b + Math.sqrt(delta)) / (2 * a);
				 x2 = 0 + (-b - Math.sqrt(delta)) / (2 * a);
						System.out.printf("%.5f", "x1=");
						System.out.printf("%.5f", x1);
						System.out.printf("%.5f", ";x2=");
						System.out.printf("%.5f", x2);
						System.out.printf("%.5f", "\n");
			}
			else if (delta < 0) //??delta??????????
			{
					  x1 = 0 + (- b) / (2 * a); //x1????
					x2 = Math.abs(Math.sqrt(-delta) / (2 * a)); //x2????
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "i;");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
			}
			else
			{
					   x1 = 0 + (- b) / (2 * a); //?????????
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "\n");
			}

		}

		return 0;
	}
}

