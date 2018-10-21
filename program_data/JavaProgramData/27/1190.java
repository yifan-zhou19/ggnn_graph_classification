package <missing>;

public class GlobalMembers
{
	//************************
	//**?????????************
	//**???  1300062709*****
	//**2013.10.9*************
	//************************


	public static int Main()



	{
		double x1;
		double x2;
		double x1i;
		double x2i;
		double a;
		double b;
		double c;
		double delta;
		double squar;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			squar = Math.sqrt(delta);
			if (delta > 0)
			{
					x1 = (-b + squar) / (2 * a);
					x2 = (-b - squar) / (2 * a);
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else if (Math.abs(delta) <= 10E-5)
			{
				x1 = (-b + squar) / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
			}
			else
			{
			  x1 = -b / (2 * a);
			  x1i = Math.sqrt(4 * a * c - b * b) / (2 * a);
			  x2i = -Math.sqrt(4 * a * c - b * b) / (2 * a);
				if (Math.abs(x1) <= 10E-5)
				{
					x1 = 0;
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", x1i);
				System.out.printf("%.5f", "i;x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", x2i);
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}


		return 0;
	}


}

