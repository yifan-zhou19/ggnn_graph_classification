package <missing>;

public class GlobalMembers
{
	/*
	 * ????1089.cpp
	 * ??????
	 * ????: 2012-10-8
	 * ??:???????????????
	 */

	public static int Main()
	{
		int n;
		double a = 0; //a,b,c?????????????x???????????
		double b = 0;
		double c = 0;
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
		double x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{ //????
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			if (delta >= 0)
			{ //????????
				if (delta > 0)
				{
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					if (x1 == 0)
					{
						x1 = 0; //????"-0"???
					}
					if (x2 == 0)
					{
						x2 = 0;
					}
					System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2); //?printf??????5???
				}
				else
				{
					x1 = (-b) / (2 * a);
					if (x1 == 0)
					{
						x1 = 0;
					}
					System.out.printf("x1=x2=%.5f\n", x1);
				}
			}
			else
			{
				x1 = (-b) / (2 * a); //???
				x = Math.sqrt(-delta) / (2 * a); //???
				if (x1 == 0)
				{
					x1 = 0;
				}
				if (x == 0)
				{
					x = 0;
				}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x,x1,x);
			}
		}
		return 0;
	}
}

