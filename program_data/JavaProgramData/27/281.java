package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???
	* @date 2011-09-27
	* @description
	* ??????: ?????????
	*/
	public static int Main()
	{
		int n;
		int k;
		double a; // ???????a,b,c??????x,y
		double b;
		double c;
		double x;
		double y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++) // ?????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0)
			{
					x = (- b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					y = (- b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); // ?????????????
				if (x == -0.00000)
				{
					x = 0.00000;
				}
				if (y == -0.00000)
				{
					y = 0.00000; // ?????-0.00000???
				}
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x);
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", y);
					System.out.printf("%.5f", "\n");
			}
			else if (b * b - 4 * a * c == 0)
			{
				x = (- b) / (2 * a); // ?????
				if (x == -0.00000)
				{
					x = 0.00000;
				}
				if (y == -0.00000)
				{
					y = 0.00000;
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				 x = (- b) / (2 * a);
				 y = (Math.sqrt(4 * a * c - b * b)) / (2 * a); // ?????
				 if (x == -0.00000)
				 {
					 x = 0.00000;
				 }
				 if (y == -0.00000)
				 {
					 y = 0.00000;
				 }
					 System.out.printf("%.5f", "x1=");
					 System.out.printf("%.5f", x);
					 System.out.printf("%.5f", "+");
					 System.out.printf("%.5f", y);
					 System.out.printf("%.5f", "i;x2=");
					 System.out.printf("%.5f", x);
					 System.out.printf("%.5f", "-");
					 System.out.printf("%.5f", y);
					 System.out.printf("%.5f", "i");
					 System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}
}

