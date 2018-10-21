package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????   **
	//*?????? 1300012972 **
	//*???2013.10.11  **
	//********************************
	public static int Main()
	{
		int n;

		// ??????a,b,c???????x1,x2??????D?????d,e??????
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double D;
		double d;
		double e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1; k <= n; k++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			if (b * b - 4 * a * c > 0) // ????????????
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); //????
				if (Math.abs(x1) < 1e-4)
				{
					x1 = 0;
				}
				if (Math.abs(x2) < 1e-4) //????
				{
					x2 = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (b * b - 4 * a * c == 0) // ?????????
			{
				x1 = (-b) / (2 * a);
				if (Math.abs(x1) < 1e-4)
				{
					x1 = 0;
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				d = (-b) / (2 * a); // ?????
				e = Math.sqrt(4 * a * c - b * b) / (2 * a); //?????
				if (Math.abs(d) < 1e-4)
				{
					d = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

