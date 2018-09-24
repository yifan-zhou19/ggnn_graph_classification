package <missing>;

public class GlobalMembers
{
	//*******************************
	//**6.cpp?????????***
	//**??????1300012993****
	//**??:2013.10.10****
	//*******************************
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double d;
		double p;
		double q;
		char i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c; //???????
			if (d > 0) //d??0,???????
			{
				   if (b != 0) //b??0??????????-0
				   {
						b = -b;
				   }
				x1 = (b + Math.sqrt(d)) / (2 * a); //?????
				x2 = (b - Math.sqrt(d)) / (2 * a);
				System.out.printf("%f", "x1=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", ";");
				System.out.printf("%.5f", "x2=");
				System.out.printf("%.5f", x2);
				System.out.printf("%.5f", "\n");
			}
			else
			{
				if (d < 0) //?????
				{
					if (b != 0) //????-0
					{
						b = -b;
					}
				 p = b / (2 * a); //????
				 q = Math.sqrt(-d) / (2 * a); //?????????
				 System.out.printf("%.5f", "x1=");
				 System.out.printf("%.5f", p);
				 System.out.printf("%.5f", "+");
				 System.out.printf("%.5f", q);
				 System.out.printf("%.5f", 'i');
				 System.out.printf("%.5f", ";");
				 System.out.printf("%.5f", "x2=");
				 System.out.printf("%.5f", p);
				 System.out.printf("%.5f", "-");
				 System.out.printf("%.5f", q);
				 System.out.printf("%.5f", 'i');
				 System.out.printf("%.5f", "\n");
				}
				else //????????d??0??????
				{
				   if (b != 0)
				   {
						b = -b; //????-0
				   }
				x1 = b / (2 * a); //????????
				x2 = b / (2 * a);
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", x1);
				System.out.printf("%.5f", "\n");
				} //????
			}

		}
		return 0;
	}

}

