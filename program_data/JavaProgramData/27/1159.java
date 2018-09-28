package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : fangcheng.cpp
	// Author      : 1234
	// Version     :
	// Copyright   : Your copyright notice
	// Description :
	//============================================================================


	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			d = b * b - 4 * a * c;

		if (d > 0)
		{
			x1 = (-b + Math.sqrt(d)) / (2 * a); //????????x1,x2
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			if (x1 == -0)
			{
				x1 = 0;
			}
			System.out.print("x1=");
			System.out.printf("%.5f", x1);
			if (x2 == -0)
			{
				x2 = 0;
			}
			System.out.printf("%.5f", ";x2=");
			System.out.printf("%.5f", x2);
			System.out.printf("%.5f", "\n");

		}
		else if (d == 0)
		{
			  System.out.printf("%.5f", "x1=x2=");
			  if (b == 0)
			  {
				  System.out.printf("%.5f", 0.00000);
			  }
			 System.out.printf("%.5f", (-b / (2 * a)));
			 System.out.printf("%.5f", "\n");
		}
		else
		{
				  x1 = -1 * b / (2 * a); //??????
			   if (x1 == -0)
			   {
				   x1 = 0;
			   }
			   x2 = Math.sqrt(-d) / (2 * a); //??????
			   System.out.printf("%.5f", "x1=");
			   System.out.printf("%.5f", x1);
			   System.out.printf("%.5f", "+");
			   System.out.printf("%.5f", x2);
			   System.out.printf("%.5f", "i");
			   System.out.printf("%.5f", ';');
			   System.out.printf("%.5f", "x2=");
			   System.out.printf("%.5f", x1);
			   System.out.printf("%.5f", "-");
			   System.out.printf("%.5f", x2);
			  System.out.printf("%.5f", "i");
			  System.out.printf("%.5f", "\n");

		}

		}


	}
}

