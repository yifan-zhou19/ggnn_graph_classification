package <missing>;

public class GlobalMembers
{
	/*
	 *???????(8.3) ????????? (1051)
	 *??????
	 *???2012?10?15? 18:15:34
	 *?????????? ax2 + bx + c = 0 ?????a???0?
	 */



	public static int Main()
	{
		float a = 0.0F;
		float b = 0.0F;
		float c = 0.0F;
		double x1 = 0.0;
		double x2 = 0.0;
		double x3 = 0.0;
		double x4 = 0.0;
		double D = 0.0;
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			D = b * b - 4 * a * c;
			if (D >= 0)
			{
				x1 = (-b + Math.sqrt(D)) / (2 * a);
				x2 = (-b - Math.sqrt(D)) / (2 * a);
			}
			else
			{
				x3 = (-b) / (2 * a);
				x4 = Math.sqrt(-D) / (2 * a);
			}
			if (x1 == 0)
			{
				x1 = 0.0;
			}
			if (x2 == 0)
			{
				x2 - 0.0;
			}
			if (x3 == 0)
			{
				x3 = 0.0;
			}
			if (D > 0)
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			  else if (D == 0)
			  {
				  System.out.printf("%.5f", "x1=x2=");
				  System.out.printf("%.5f", x1);
				  System.out.printf("%.5f", "\n");
			  }
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x3);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", x4);
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", x3);
					System.out.printf("%.5f", "-");
					System.out.printf("%.5f", x4);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
		}
		return 0;
	}
}

