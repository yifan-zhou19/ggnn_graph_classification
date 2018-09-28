package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????   **
	//*?????? 1300012934 **
	//*???2013.10.14  **
	//********************************


	public static int Main()
	{
		int n;
		double a; //p ?i?????????????d???????
		double b;
		double c;
		double x1;
		double x2;
		double p;
		double i;
		double d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1 ; k <= n ; k++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c;
			if (d < 0) //?????
			{
				i = Math.sqrt(-d) / (2 * a);
				p = - b / (2 * a);
				if (p == - 0)
				{
					p = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", p);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", i);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", p);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", i);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (d > 0) //????????
				{
					x1 = (-b + Math.sqrt(d)) / (2 * a);
					x2 = (-b - Math.sqrt(d)) / (2 * a);
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
				else //????????
				{
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", -b / (2 * a));
					System.out.printf("%.5f", "\n");
				}
			}
		}



		return 0;
	}
}

