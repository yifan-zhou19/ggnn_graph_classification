package <missing>;

public class GlobalMembers
{
	//************************************************************
	//*9.14????????????                    ***********
	//*?????  1100012844                          ***********
	//*???2011.9.16                                 ***********
	//*?????????,?????100??,??!      ***********
	//************************************************************
	public static int Main()
	{
		int n; //??n,k?????
		int k;
		double a; //??a,b,c???????
		double b;
		double c;
		double d; //??d,x1,x2,x3???????
		double x1;
		double x2;
		double x3;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++) //for?????????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c; //??????????d
			if (d >= 0) //?????????????0
			{
				if (d > 0) //???????0,???????
				{
					x1 = (-b + Math.sqrt(d)) / (2 * a); //??????x1??
					x2 = (-b - Math.sqrt(d)) / (2 * a); //??????x2??
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "\n");
				}
				else //??????0,???????
				{
					x1 = (-b) / (2 * a); //??????????
					System.out.printf("%.5f", "x1=x2=");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "\n");
				}
			}
			else //???????0,???????
			{
				x3 = (-b) / (2 * a); //?????x3
					x1 = Math.sqrt(-d) / (2 * a); //?x1?????
					x2 = -Math.sqrt(-d) / (2 * a); //?x2?????
					if (Math.abs(x3) < 0.0000000001) //???????
					{
						x3 = 0;
					}
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x3);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", x1);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x3);
					System.out.printf("%.5f", x2);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}


}

