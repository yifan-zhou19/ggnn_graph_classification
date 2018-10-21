package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????????.cpp
	 * ?????1200012840
	 * ?????2012-10-19
	 * ???????
	        x1 = (-b + sqrt(b*b-4*a*c))/(2*a)
	        x2 = (-b - sqrt(b*b-4*a*c))/(2*a)
	                ??????? ax2 + bx + c = 0 ?????a???0?
	 */



	public static int Main()
	{
		int i; //????
		int n;
		double a; //????
		double b;
		double c;
		double x1;
		double x2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++) //??for??
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0) //??delta?0???
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2); //?????x1,x2??
			}
			if (b * b - 4 * a * c == 0) //??delta?0???
			{
				if (b != 0) //??b??
				{
				x1 = -b / (2 * a);
				}
				else
				{
					x1 = 0;
				}
				x1 = -b / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1); //?????x1,x2??
			}
			if (b * b - 4 * a * c < 0) //??delta?0???
			{
				if (b != 0) //??b??
				{
				  x1 = -b / (2 * a);
				}
				else
				{
					x1 = 0;
				}
					 x2 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x2,x1,x2); //?????x1,x2??

			}
		}
		return 0; //????
	}

}

