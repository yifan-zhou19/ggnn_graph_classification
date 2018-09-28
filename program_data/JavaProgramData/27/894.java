package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????   **
	//*?????? 1300012713 **
	//*???2013.10.11  **
	//********************************

	public static int Main()
	{
		int n; //????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a; //???????????
		double b;
		double c;
		double x1;
		double x2;
		double d;
		double e;
		for (int i = 1; i <= n; i++) //?????????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0) //????????
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); //?????
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.print("x1=");
				System.out.printf("%.5f", x1);
				System.out.print(";x2=");
				System.out.printf("%.5f\n", x2);
			}
			if (b * b - 4 * a * c == 0) //????????
			{
				x1 = (-b) / (2 * a); //???
				System.out.print("x1=x2=");
				System.out.printf("%.5f\n", x1);
			}
			if (b * b - 4 * a * c < 0) //????????
			{
				d = Math.sqrt(4 * a * c - b * b) / (2 * a);
				e = (-b) / (2 * a);
				if (e == 0)
				{
					e = 0;
				}
				x1 = e + d * i; //????
				x2 = e - d * i;
				System.out.print("x1=");
				System.out.printf("%.5f", e);
				System.out.print("+");
				System.out.printf("%.5f", d);
				System.out.print("i;x2=");
				System.out.printf("%.5f", e);
				System.out.print("-");
				System.out.printf("%.5f", d);
				System.out.print("i");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

