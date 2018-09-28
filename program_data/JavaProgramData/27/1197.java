package <missing>;

public class GlobalMembers
{
	/*
	 * phoenix3.cpp
	 *Author: ???
	 *  Created on: 2013-9-27
	 *      ?????????
	 */


	public static int Main()
	{
		float a;
		float b;
		float c;
		double d;
		double derta;
		double g;
		double h;
		double f;
		double k;
		int n;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			d = -b / (2 * a);
			if (Math.abs(d) < 1e-10)
			{
				d = -d;
			}
			derta = b * b - 4 * a * c;
			if (derta == 0)
			{
				 System.out.print("x1=x2=");
				 System.out.printf("%.5f\n\n",d);

			}
			else
			{
				if (derta < 0)
				{
				  f = Math.sqrt(-derta);
				  k = f / (2 * a);
				  System.out.print("x1=");
				  System.out.printf("%.5f",d);
				  System.out.print("+");
				  System.out.printf("%.5f",k);
				  System.out.print("i");
				  System.out.print(";");
				  System.out.print("x2=");
				  System.out.printf("%.5f",d);
				  System.out.print("-");
				  System.out.printf("%.5f",k);
				  System.out.print("i");
				  System.out.print('\n');
				  System.out.print("\n");
				}
				else
				{
					f = Math.sqrt(derta);
					k = f / (2 * a);
					g = d + k;
					h = d - k;
					System.out.print("x1=");
					System.out.printf("%.5f",g);
					System.out.print(";");
					System.out.print("x2=");
					System.out.printf("%.5f",h);
					System.out.print('\n');
					System.out.print("\n");
				}
			}
		}
		return 0;
	}






}

