package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????   **
	//*?????? 1300012855 **
	//*???2013.10.11  **
	//********************************


	public static int Main()
	{
		int n; // n???????
		double a; // ???????
		double b;
		double c;
		double x1; // ??????
		double x2;
		double delta; // delta?????front?-b/2a?back?sqrt(-delta)/2a
		double front;
		double back;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++) // ??????i???n??n?????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c; // ?????
			if (delta < 0) // ???????????????????front?back???
			{
				front = -b / (2 * a); // ??
				if (front == 0)
				{
					front = - front; // ??-0.00000??
				}
				back = Math.sqrt(-delta) / (2 * a); // ??
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", front);
				System.out.printf("%.5f", '+');
				System.out.printf("%.5f", back);
				System.out.printf("%.5f", "i;");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", front);
				System.out.printf("%.5f", '-');
				System.out.printf("%.5f", back);
				System.out.printf("%.5f", 'i');
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (delta == 0) // ?????0?????????
				{
					x1 = -b / (2 * a); // ????????????
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "\n");
				}
				else
				{
					x1 = (-b + Math.sqrt(delta)) / (2 * a); // ?????????????
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ';');
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}

			}
		}
		return 0;
	}
}

